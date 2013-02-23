package com.freesoft.struts2.converter;

import java.util.Map;
import java.util.StringTokenizer;

import org.apache.struts2.util.StrutsTypeConverter;

import com.freesoft.struts2.bean.User;

public class UserConverter2 extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		// string convert to user
		String user = values[0];
		
		StringTokenizer st = new StringTokenizer(user, ":");
		String username = st.nextToken();
		String password = st.nextToken();
		
		User result = new User();
		result.setUsername(username);
		result.setPassword(password);
		return result;
	}

	@Override
	public String convertToString(Map context, Object o) {
		User user  = (User)o;
		return new String("username:" + user.getUsername() + ";password:" + user.getPassword());
	}

}
