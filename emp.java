package com.spring.core.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class emp {
	private String empname;
	private List<String> phones;
	private Set<String> address;
	private Map<String , String> courses;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public emp(String empname, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		this.empname = empname;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "emp [empname=" + empname + ", phones=" + phones + ", address=" + address + ", courses=" + courses + "]";
	}
	
	
}
