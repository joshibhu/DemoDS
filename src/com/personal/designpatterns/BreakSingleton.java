package com.personal.designpatterns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BreakSingleton{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Singleton instanceOne = Singleton.getInstance();
		ObjectOutput outputStr = new ObjectOutputStream(new FileOutputStream("C:/tmp.txt"));
		outputStr.writeObject(instanceOne);
		outputStr.close();
		
		ObjectInput inputStr = new ObjectInputStream(new FileInputStream("C:/tmp.txt"));
		Singleton instanceTwo = (Singleton) inputStr.readObject();
		inputStr.close();
		
		System.out.println("First ::"+instanceOne.hashCode());
		System.out.println("Second ::"+instanceTwo.hashCode());
	}
}

class Singleton implements Serializable {

	private static volatile Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	//this method needs to be implemented to maintain the 
	//singleton class behavior in case of serialization
	protected Object readResolve() {
	    return getInstance();
	}
}

