package com.ty.Mediatypeproducesconsumes;

public class StudentInfo {
	
	private int id;
	
	private String name;
	
	private double marks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public StudentInfo(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	
	public StudentInfo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
