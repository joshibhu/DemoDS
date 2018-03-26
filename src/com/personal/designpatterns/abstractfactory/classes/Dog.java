package com.personal.designpatterns.abstractfactory.classes;

public class Dog extends LandAnimal{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Dog ::"+ super.getDescription();
	}
}
