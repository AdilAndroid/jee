package com.freesoft.struts2.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.struts2.util.StrutsTypeConverter;

import com.freesoft.struts2.bean.User;

public class UsersConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		List<User> users = new ArrayList<User>();
		
		for(String value: values) {
		StringTokenizer st = new StringTokenizer(value, ":");
		String username = st.nextToken();
		String password = st.nextToken();
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		users.add(user);
		}
		return users;
	}

	@Override
	public String convertToString(Map context, Object o) {
		List<User> users  = (List<User>)o;
		String strUsers = "";
		for(User user: users) {
			strUsers = strUsers + "[username:" + user.getUsername() + ";password:" + user.getPassword() + "] ";
		}
				
		return strUsers;
	}

}
