package com.personal.collection;

import java.util.Comparator;

public class Student implements Comparable<Student>{

	private String name;
	
	private int rollNo;
	
	

	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		/*if(this.rollNo > o.rollNo) {
			return -1;
		}else if(this.rollNo < o.rollNo) {
			return 1;
		}*/
		return 0;
	}
	
}
