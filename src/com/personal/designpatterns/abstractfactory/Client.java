package com.personal.designpatterns.abstractfactory;

import com.personal.designpatterns.abstractfactory.classes.Animal;

public class Client {

	public static void main(String[] args) {
		AnimalFactory animalFactory = AnimalFactory.getAnimalFactory("sea");
		Animal animal = animalFactory.getAnimal("shark");
		System.out.println(animal.getDescription());
	}
}
