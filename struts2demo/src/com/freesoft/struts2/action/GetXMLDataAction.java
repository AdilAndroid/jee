package com.freesoft.struts2.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import com.freesoft.struts2.bean.User;
import com.opensymphony.xwork2.ActionSupport;

public class GetXMLDataAction extends ActionSupport {
	private String name;

	/**
	 * 
	 */
	private static final long serialVersionUID = -3574398130272090010L;

	@Override
	public String execute() throws Exception {
		User user = new User();
		user.setUsername(name);
		user.setPassword("password:" + name);
		
		Document doc = DocumentHelper.createDocument();
		Element root = doc.addElement("Users");
		root.addComment("Users List.");
		
		Element eUser = root.addElement("User");
		Element eUsername = eUser.addElement("username");
		Element ePassword = eUser.addElement("password");
		
		eUsername.setText(user.getUsername());
		ePassword.setText(user.getPassword());
		
		HttpServletResponse resp = ServletActionContext.getResponse();
		resp.setContentType("text/xml; charset=utf-8");
		resp.setHeader("cache-control", "no-cache");
		
		PrintWriter outs = resp.getWriter();
		
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		
		XMLWriter writer = new XMLWriter(outs, format);
		writer.write(doc);
		
		outs.flush();
		outs.close();
		
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
