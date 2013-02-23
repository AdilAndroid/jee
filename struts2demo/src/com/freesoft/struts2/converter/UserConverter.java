package com.freesoft.struts2.converter;

import java.util.Map;
import java.util.StringTokenizer;

import com.freesoft.struts2.bean.User;

import ognl.DefaultTypeConverter;

public class UserConverter extends DefaultTypeConverter {
	@Override
	public Object convertValue(Map context, Object value, Class toType) {
		if (toType.equals(User.class)) {
			// string convert to user
			String[] paramUsers = (String[])value;
			String user = paramUsers[0];
			
			StringTokenizer st = new StringTokenizer(user, ":");
			String username = st.nextToken();
			String password = st.nextToken();
			
			User result = new User();
			result.setUsername(username);
			result.setPassword(password);
			return result;
			
		} else if (toType.equals(String.class)) {
			return null;
//			User user  = (User)value;
//			return new String("username:" + user.getUsername() + ";password:" + user.getPassword());
		}
		return super.convertValue(context, value, toType);
	}

}
