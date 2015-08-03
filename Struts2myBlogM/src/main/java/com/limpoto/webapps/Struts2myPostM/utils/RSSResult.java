package com.limpoto.webapps.Struts2myPostM.utils;

import java.io.PipedWriter;
import java.io.PrintWriter;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import com.opensymphony.xwork2.util.ValueStack;

public class RSSResult implements Result {
	
	private String channelTitle;
	private String channelDescription;
	private String channelLink;
	private String itemsCollection;
	private String itemTitle;
	private String itemDescription;

	public String getChannelTitle() {return channelTitle;}
	public void setChannelTitle(String channelTitle) {this.channelTitle = channelTitle;}
	public String getChannelDescription() {return channelDescription;}
	public void setChannelDescription(String channelDescription) {this.channelDescription = channelDescription;}
	public String getChannelLink() {return channelLink;}
	public void setChannelLink(String channelLink) {this.channelLink = channelLink;}
	public String getItemsCollection() {return itemsCollection;}
	public void setItemsCollection(String itemsCollection) {this.itemsCollection = itemsCollection;}
	public String getItemTitle() {return itemTitle;}
	public void setItemTitle(String itemTitle) {this.itemTitle = itemTitle;}
	public String getItemDescription() {return itemDescription;}
	public void setItemDescription(String itemDescription) {this.itemDescription = itemDescription;}

	@Override
	public void execute(ActionInvocation invocation) throws Exception {
		ValueStack vs = invocation.getStack();
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter pw = response.getWriter();
		
		response.setContentType("application/xml");
		pw.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		pw.println("<rss version=\"2.0\">");
		pw.println("<channel>");
		pw.println("<title>" + getChannelTitle() + "</title>");
		pw.println("<description>" + getChannelDescription() + "</description>");
		pw.println("<link>" + getChannelLink() + "</link>");
		
		Iterable<Object> items = (Iterable)vs.findValue(getItemsCollection());
		for (Object item : items) {
			pw.println("<item>");
			Class cls = item.getClass();
			
			Method mtitle = cls.getMethod("get" + itemTitle.substring(0,1).toUpperCase() + itemTitle.substring(1));
			Object titleValue = mtitle.invoke(item);
			
			Method mdescription = cls.getMethod("get" + itemTitle.substring(0,1).toUpperCase() + itemTitle.substring(1));
			Object descriptionValue = mdescription.invoke(item);
			
			pw.println("<title>" + titleValue + "</title");
			pw.println("<description>" + descriptionValue + "</description");
			pw.println("<link>http://www.google.fr/webhp?sourceid=chrome-instant&rlz=1C1AVNG_enFR615FR615&ion=1&espv=2&ie=UTF-8#q="+ titleValue +"</link");
			https://www.google.fr/webhp?sourceid=chrome-instant&rlz=1C1AVNG_enFR615FR615&ion=1&espv=2&ie=UTF-8#q=togo
			pw.println("</item>");
		}
		pw.println("</channel>");
		pw.println("</rss>");
	}

}
