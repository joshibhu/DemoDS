package com.personal.designpatterns.builder;

public class BuilderTest {

	public static void main(String[] args) {
		Phone p = new PhoneBuilder().setOs("Android").setBrand("LG").setRam(4).getPhone();
		System.out.println(p);
	}
}
