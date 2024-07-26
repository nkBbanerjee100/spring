package com.springcore.collection;

import java.util.*;

public class CollectionsChecking {
	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String,String> courses;
	private Properties props;
	public String getName() {
		return name;
	}
	public CollectionsChecking(Properties props) {
		super();
		this.props = props;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public CollectionsChecking() {
		super();
	}
	public CollectionsChecking(String name, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

}
