package com.freesoft.bean;

import java.util.Set;

public class Student {
	private String id;
	private Long student_number;
	private Team team;
	private Set<Course> courses;
//	private IdCard idcard;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
//	public IdCard getIdcard() {
//		return idcard;
//	}
//	public void setIdcard(IdCard idcard) {
//		this.idcard = idcard;
//	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public Long getStudent_number() {
		return student_number;
	}
	public void setStudent_number(Long student_number) {
		this.student_number = student_number;
	}
	
}
