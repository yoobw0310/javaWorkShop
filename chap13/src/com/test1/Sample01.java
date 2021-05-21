package com.test1;

import java.util.*;

class Animal {
	void breathing() {
		System.out.println("Animal"	);
	}
}
class Dog extends Animal {
	void breathing() {
		System.out.println("Dog");
	}
}
public class Sample01 {
	static void testMethod(List<? extends Animal> list) {
		for(Animal a : list) {
			a.breathing();
		}
	}
	public static void main(String[] args) {
		testMethod(new ArrayList<Animal>());
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		testMethod(dogs);
		List<Animal> animals = new ArrayList<>();
		animals.add(new Dog());
		animals.add(new Animal());
		
	}

}
