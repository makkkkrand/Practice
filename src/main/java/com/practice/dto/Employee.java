package com.practice.dto;

import java.util.Objects;

public class Employee {

	public Employee() {
		super();
	}
	
	public Employee(String id, String name, String gender, String department, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
	}
	private String id;
	private String name;
	private String gender;
	private String department;
	private Double salary;
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getDepartment() {
		return department;
	}
	public Double getSalary() {
		return salary;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(department, gender, id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && Objects.equals(gender, other.gender)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
	}
	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s, gender=%s, department=%s, salary=%s]", id, name, gender,
				department, salary);
	}
	
	
	
}
