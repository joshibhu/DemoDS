package com.personal.designpatterns.abstractfactory;

import com.personal.designpatterns.abstractfactory.classes.Animal;
import com.personal.designpatterns.abstractfactory.classes.Octopus;
import com.personal.designpatterns.abstractfactory.classes.Shark;

public class SeaAnimalFactory extends AnimalFactory{

	@Override
	public Animal getAnimal(String animalName) {
		// TODO Auto-generated method stub
		if(animalName.equalsIgnoreCase("Shark")) {
			return new Shark();
		}else if(animalName.equalsIgnoreCase("Octopus")) {
			return new Octopus();
		}
		return null;
	}

}
