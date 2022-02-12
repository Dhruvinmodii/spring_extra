package com.spring.core.collection;

public class cons_inject {
	private int id;
	private String name;
	
	public cons_inject(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "cons_inject [id : " + id + ", name : " + name + "]";
	}
	
	
}
