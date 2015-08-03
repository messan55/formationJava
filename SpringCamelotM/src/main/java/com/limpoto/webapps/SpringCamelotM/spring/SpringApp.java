package com.limpoto.webapps.SpringCamelotM.spring;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.limpoto.webapps.SpringCamelotM.beans.IChevalier;

public class SpringApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
        Scanner input = new Scanner(System.in);
        
        input.nextLine();
        System.out.println("--------------------------------------");

        IChevalier c1 = ctx.getBean("jacquot", IChevalier.class);
        c1.partirEnQuete();
        
        IChevalier c2 = ctx.getBean("charleduham", IChevalier.class);
        c2.partirEnQuete();
        
		System.out.println("--------------------------------------");

		System.out.println("done...");
	}

}
