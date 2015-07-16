package com.loncoto.webSessionFiltre.utils;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class WebFiltre
 */
public class WebFiltre implements Filter {
	
	private String name;

    /**
     * Default constructor. 
     */
    public WebFiltre() {
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println(name + " appel de doFilter avant chain");
		System.out.println(name + " resquest -> " + request.getRemoteAddr());
		chain.doFilter(request, response);
		System.out.println(name + " appel de doFilter après chain");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		name = fConfig.getFilterName();
		System.out.println("init du filtre webfiltre " + name);
	}

}
