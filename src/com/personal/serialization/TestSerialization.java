package com.personal.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Student s = new Student("Bhuwan", "Gurgaon", "abc");
		ObjectOutput oos = new ObjectOutputStream(new FileOutputStream("C:/tmp.ser"));
		oos.writeObject(s);
		oos.close();
		
		ObjectInput ois = new ObjectInputStream(new FileInputStream("C:/tmp.ser"));
		Student s1 = (Student)ois.readObject();
		System.out.println(s1.getName()+"::"+s1.getAddress() + "::" +s1.getId());
	}
}

class School {
	private String name;

	public School(String name) {
		super();
		this.name = name;
	}
	
	
}

class Student extends School implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String name;
	
	private String address;
	
	private String id;

	public Student(String name, String address , String id) {
		super("abc");
		this.name = name;
		this.address = address;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
