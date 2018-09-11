package com.chrisdev;

class AnimalFactoryTest {

    public static void main(String[] args) {
	   Animal rabbit = AnimalFactory.create("rabbit");
	   rabbit.sound();
    }
}
