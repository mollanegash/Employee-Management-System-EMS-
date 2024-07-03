package com.EmployeeApi;


public class Employee {
	private int employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String title;
	
	public Employee() {
		
	}
	public Employee(int id, String fname, String lname, String email, String title) {
		this.employee_id=id;
		this.first_name=fname;
		this.last_name=lname;
		this.title=title;
		// TODO Auto-generated constructor stub
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
