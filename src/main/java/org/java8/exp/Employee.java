package org.java8.exp;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
	private int id;

	private String name;

	private String jobTitle;

	private double salary;
	private LocalDate joiningDate;

	public Employee(int id, String name, String jobTitle, double salary, LocalDate joiningDate) {

		this.id = id;
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
		this.joiningDate = joiningDate;

	}

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
	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}



	@Override
	public int compareTo(Employee o) {

		return (this.id < o.id) ? -1 : (this.id > o.id ? 1 : 0);
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", jobTitle='" + jobTitle + '\'' +
				", salary=" + salary +
				", joiningDate=" + joiningDate +
				'}';
	}
}
