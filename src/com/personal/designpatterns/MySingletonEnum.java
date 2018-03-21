package com.personal.designpatterns;

public enum MySingletonEnum {

	INSTANCE;
	
	public String getConnection() {
		return "connection";
	}
}
