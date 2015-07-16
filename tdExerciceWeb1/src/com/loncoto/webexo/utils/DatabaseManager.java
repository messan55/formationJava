package com.loncoto.webexo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/**
 * Application Lifecycle Listener implementation class DatabaseManager
 *
 */
public class DatabaseManager implements ServletContextListener {

	private Connection base;
    /**
     * Default constructor. 
     */
    public DatabaseManager() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
    	try {
			base.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent ce)  { 
    	System.out.println("datamanager en marche");
    	String driverclass = ce.getServletContext().getInitParameter("driverclass");
        String databaseur2 = ce.getServletContext().getInitParameter("databaseur2");
        String login = ce.getServletContext().getInitParameter("login");
        String password = ce.getServletContext().getInitParameter("password");
    	
        try {
			Class.forName(driverclass);
			base = DriverManager.getConnection(databaseur2, login, password);
			System.out.println("connection base");
			ArticleDAO articleDAO = new ArticleDAO(base);
			ce.getServletContext().setAttribute("articleDAO", articleDAO);
		} 
        catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
        
    }
	
}
