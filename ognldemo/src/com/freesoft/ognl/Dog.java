package com.freesoft.ognl;

import java.util.List;

public class Dog {
	private String name;
	private List<String> friends = null;
	private String nickname[] = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public String[] getNickname() {
		return nickname;
	}

	public void setNickname(String[] nickname) {
		this.nickname = nickname;
	}
}
