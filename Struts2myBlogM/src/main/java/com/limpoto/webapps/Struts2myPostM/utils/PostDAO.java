package com.limpoto.webapps.Struts2myPostM.utils;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import com.limpoto.webapps.Struts2myPostM.beans.Post;



public class PostDAO {
	public static final String FIND_ALL_SQL = "select * from `post`";
	public static final String FIND_BY_ID_SQL = "select * from `post` where `id`=?";
	public static final String UPDATE_ONE_SQL = "update `post` set `titre`=?, `corps`=? where `id`=?";
	public static final String INSERT_ONE_SQL = "insert into `post` (`titre`, `corps`, `date`) values (?,?,?)";
	public static final String DELETE_ONE_SQL = "delete from `post` where `id`=?";
	
	private PreparedStatement findAllStatement;
	private PreparedStatement findByIDStatement;
	private PreparedStatement updateOneStatement;
	private PreparedStatement insertOneStatement;
	private PreparedStatement deleteOneStatement;
	
	private Connection base;
	
	public PostDAO(Connection base) {
		this.base = base;
		try {
			findAllStatement = base.prepareStatement(FIND_ALL_SQL);
			findByIDStatement = base.prepareStatement(FIND_BY_ID_SQL);
			updateOneStatement = base.prepareStatement(UPDATE_ONE_SQL);
			insertOneStatement = base.prepareStatement(INSERT_ONE_SQL);
			deleteOneStatement = base.prepareStatement(DELETE_ONE_SQL);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int delete(int id) {
		try {
			deleteOneStatement.clearParameters();
			deleteOneStatement.setInt(1, id);
			return deleteOneStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	
	
	public int save(Post c) {
		if (c.getId() > 0) {
			// c'est un update
			try {
				updateOneStatement.clearParameters();
				updateOneStatement.setString(1, c.getTitre());
				updateOneStatement.setString(2, c.getCorps());
				updateOneStatement.setDate(3, new java.sql.Date(c.getDateCreation().getTime()));
				updateOneStatement.setInt(4, c.getId());
				return updateOneStatement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else {
			// c'est une insert
			try {
				insertOneStatement.clearParameters();
				insertOneStatement.setString(1, c.getTitre());
				insertOneStatement.setString(2, c.getCorps());
				insertOneStatement.setDate(3, new java.sql.Date(c.getDateCreation().getTime()));
				return insertOneStatement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	
	
	public Post findByID(int id) {
		Post c = null;
		try {
			findByIDStatement.clearParameters();
			// je remplace le premier point d'interogation par l'id que j'ai en parametre
			findByIDStatement.setInt(1, id);
			
			ResultSet rs = findByIDStatement.executeQuery();
			if (rs.next()) {
				c = new Post(rs.getInt("id"),
						rs.getString("titre"),
						rs.getString("corps"),
						rs.getDate("date"));
			}
			rs.close();
		} catch (SQLException e) {	e.printStackTrace();}
		return c;
	}
	
	
	
	public List<Post> findAll() {
		ArrayList<Post> data = new ArrayList<Post>();
		ResultSet rs = null;
		try {
			// je nettoie les parametres pr�c�dents
			findAllStatement.clearParameters();
			// j'execute la requette
			rs = findAllStatement.executeQuery();
			while (rs.next()) {
				data.add(new Post(rs.getInt("id"),
									rs.getString("titre"),
									rs.getString("corps"),
									rs.getDate("date")));
			}
		} catch (SQLException e) {e.printStackTrace();}
		finally {
			// nous avons finit, nous fermons le resultset
			if (rs != null)
				try {rs.close();} catch (SQLException e) {e.printStackTrace();}
		}
		// on renvoie la liste des clients
		return data;
	}
	
	

}
