package com.loncoto.webexo.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.loncoto.webexo.beans.*;


public class ArticleDAO {

	public static final String FIND_ALL_SQL = "select * from articles";
	public static final String FIND_BY_ID_SQL = "select * from articles where id = ?";
	public static final String UPDATE_ONE_SQL = "update articles set libelle = ? , prix = ? , poids = ? where id = ?";
	public static final String INSERT_ONE_SQL = "insert into articles (libelle, prix, poids) values(?, ?, ?)";
	public static final String DELETE_ONE_SQL = "delete from articles where id = ?";
	
	private PreparedStatement findAllStatement;
	private PreparedStatement findByIDStatement;
	private PreparedStatement updateOneStatement;
	private PreparedStatement insertOneStatement;
	private PreparedStatement deleteOneStatement;
	
	private Connection base;

	public ArticleDAO(Connection base) {
		this.base = base;
		
		try {
			findAllStatement = base.prepareStatement(FIND_ALL_SQL);
			findByIDStatement = base.prepareStatement(FIND_BY_ID_SQL);
			updateOneStatement = base.prepareStatement(UPDATE_ONE_SQL);
			insertOneStatement = base.prepareStatement(INSERT_ONE_SQL);
			deleteOneStatement = base.prepareStatement(DELETE_ONE_SQL);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Article> findAll(){
		//ArrayList<Client> data = new ArrayList<Client>();
		ArrayList<Article> data = new ArrayList<Article>();
		ResultSet rs = null;
		
		try {
			findAllStatement.clearParameters();
			rs = findAllStatement.executeQuery();
			
			while (rs.next()) {
				data.add(new Article(rs.getInt("id"),
									rs.getString("libelle"),
									rs.getDouble("prix"),
									rs.getDouble("poids")));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return data;
	}
}
