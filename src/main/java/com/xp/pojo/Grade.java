package com.xp.pojo;

public class Grade {

	private Integer id;
	private String gradName;

	public Grade() {
	}
	
	public Grade(int i, String string) {
		this.id = i;
		this.gradName = string;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGradName() {
		return gradName;
	}

	public void setGradName(String gradName) {
		this.gradName = gradName;
	}

	@Override
	public String toString() {
		return "Grade [id=" + id + ", gradName=" + gradName + "]";
	}
	
}
