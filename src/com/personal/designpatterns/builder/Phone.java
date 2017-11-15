package com.personal.designpatterns.builder;

public class Phone {

	private String os;
	private String brand;
	private String processor;
	private Integer size;
	private Integer ram;
	public Phone(String os, String brand, String processor, Integer size, Integer ram) {
		super();
		this.os = os;
		this.brand = brand;
		this.processor = processor;
		this.size = size;
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", brand=" + brand + ", processor=" + processor + ", size=" + size + ", ram=" + ram
				+ "]";
	}
	
}
