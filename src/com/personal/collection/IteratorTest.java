package com.personal.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class IteratorTest {
	

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		myList.add("Bhuwan");
		myList.add("Gunjan");
		myList.add("Dipti");
		Iterator<String> itr =myList.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			if(name.equals("Bhuwan")) {
				itr.remove();
			}
		}
		System.out.println(myList);
		
		Map<String, String> myMap = new HashMap<>();
		Set<Student> mySet = new TreeSet<>();
		Student s1 = new Student("Bhuwan", 1111);
		Student s2 = new Student("Bhuwan4", 1114);
		Student s3 = new Student("Bhuwan3", 1113);
		Student s4 = new Student("Bhuwan2", 1112);
		Student s5 = new Student("Bhuwan5", 1115);
		
		mySet.add(s1);
		mySet.add(s2);
		mySet.add(s3);
		mySet.add(s4);
		mySet.add(s5);
		
		for (Student student : mySet) {
			System.out.println(student.getName());
		}
	}
}

