package com.personal.designpatterns.abstractfactory;

import com.personal.designpatterns.abstractfactory.classes.Animal;

public abstract class AnimalFactory {

	public abstract Animal getAnimal(String animalName);
	
	public static AnimalFactory getAnimalFactory(String type) {
		if(type.equalsIgnoreCase("land")) {
			return new LandAnimalFactory();
		}else if(type.equalsIgnoreCase("sea")) {
			return new SeaAnimalFactory();
		}
		return null;
	}
}
