package com.personal.designpatterns.builder;

public class PhoneBuilder {

	private String os;
	private String brand;
	private String processor;
	private Integer size;
	private Integer ram;
	
	//just change the return type
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setSize(Integer size) {
		this.size = size;
		return this;
	}
	public PhoneBuilder setRam(Integer ram) {
		this.ram = ram;
		return this;
	}
	
	//return the main object for which this builder is built
	public Phone getPhone() {
		return new Phone(os, brand, processor, size, ram);
	}
	
}
