package com.limpoto.webapps.Struts2myPostM.utils;

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
    public void contextInitialized(ServletContextEvent arg0)  { 
         System.out.println("demarrage de databaseManager");
         String driverclass = arg0.getServletContext().getInitParameter("driverclass");
         String databaseurl = arg0.getServletContext().getInitParameter("databaseurl");
         String login = arg0.getServletContext().getInitParameter("login");
         String password = arg0.getServletContext().getInitParameter("password");
         
         try {
        	 // chargement du driver mysql
             Class.forName(driverclass);
             base = DriverManager.getConnection(databaseurl, login, password);
             System.out.println("connecté à la base");
             // creation du clientdao
             PostDAO postDAO = new PostDAO(base);
             // je met le clientDAO a disposition des servlets
             arg0.getServletContext().setAttribute("postDAO", postDAO);
	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
    }
	
}
