package com.loncoto.webfirstjdbc.utils;

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
    public void contextInitialized(ServletContextEvent ce)  { 
         System.out.println("démarrage dataManager");
         String driverclass = ce.getServletContext().getInitParameter("driverclass");
         String databaseur1 = ce.getServletContext().getInitParameter("databaseur1");
         String login = ce.getServletContext().getInitParameter("login");
         String password = ce.getServletContext().getInitParameter("password");
         
         // chargement du driver mysql
         
         try {
			Class.forName(driverclass);
			base = DriverManager.getConnection(databaseur1, login, password);
			System.out.println("connecter à la base");
			ClientDAO clientDAO = new ClientDAO(base);
			ce.getServletContext().setAttribute("clientDAO", clientDAO);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
	
}
