/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C5
 */
public class TestAnimal {

    public static void main(String[] arges) {

        Animal animal = new Animal();
        animal.makesound("animal");

        Dog dog = new Dog();
        dog.makesound("Dog");

        Cat cat = new Cat();
        cat.makesound("cat");

    }

}
