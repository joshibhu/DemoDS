package com.personal.designpatterns.abstractfactory.classes;

public class Shark extends SeaAnimal{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Shark ::"+ super.getDescription();
	}
}
