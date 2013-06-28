package com.freesoft.bean;

import java.util.Set;

public class Category {
	private Long id;
	private String name;
	private Category parent;
	private Set<Category> child;
	
	public Category(String name) {
		super();
		this.name = name;
	}
	
	public Category(String name, Category parent) {
		super();
		this.name = name;
		this.parent = parent;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getParent() {
		return parent;
	}
	public void setParent(Category parent) {
		this.parent = parent;
	}
	public Set<Category> getChild() {
		return child;
	}
	public void setChild(Set<Category> child) {
		this.child = child;
	}
}
