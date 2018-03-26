package com.personal.designpatterns.abstractfactory;

import com.personal.designpatterns.abstractfactory.classes.Animal;
import com.personal.designpatterns.abstractfactory.classes.Cat;
import com.personal.designpatterns.abstractfactory.classes.Dog;

public class LandAnimalFactory extends AnimalFactory{

	@Override
	public Animal getAnimal(String animalName) {
		// TODO Auto-generated method stub
		if(animalName.equalsIgnoreCase("Dog")) {
			return new Dog();
		}else if(animalName.equalsIgnoreCase("Cat")) {
			return new Cat();
		}
		return null;
	}


}
