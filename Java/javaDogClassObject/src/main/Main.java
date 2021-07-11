package main;

import animal.Cat;
import animal.Dog;
public class Main {
    public static void main(String[] args){

        // Create Dog Objects
            //Created constructors to build object. No need for setters below now.
        /*
        Dog dog1 = new Dog("Doberman", 13, "Alert", 500.0);
        Dog dog2 = new Dog("Pug", 20, "Sleepy", 5000.0);
        Dog dog3 = new Dog("Poodle", 13, "Attentive", 700);
        Dog dog4 = new Dog("Terrier", 14, "Curious", 689.98);
        */


        //Call Setters
        //Dog1
        /*
        dog1.setBreed("Doberman");
        dog1.setLifespan(13);
        dog1.setBehavior("Alert");
        dog1.setPrice(500.0);
        */


        //Dog2
        /*
        dog2.setBreed("Pug");
        dog2.setLifespan(20);
        dog2.setBehavior("Sleepy");
        dog2.setPrice(5000.0);
         */


        /*
        //Call getters
        //Dog1
        System.out.println("Breed: " + dog1.getBreed());
        System.out.println("Lifespan: " + dog1.getLifespan());
        System.out.println("Behavior: " + dog1.getBehavior());
        System.out.println("Price: " + dog1.getPrice());
        //Dog2
        System.out.println("Breed: " + dog2.getBreed());
        System.out.println("Lifespan: " + dog2.getLifespan());
        System.out.println("Behavior: " + dog2.getBehavior());
        System.out.println("Price: " + dog2.getPrice());
        //Dog3
        System.out.println("Breed: " + dog3.getBreed());
        System.out.println("Lifespan: " + dog3.getLifespan());
        System.out.println("Behavior: " + dog3.getBehavior());
        System.out.println("Price: " + dog3.getPrice());
        //Dog4
        System.out.println("Breed: " + dog4.getBreed());
        System.out.println("Lifespan: " + dog4.getLifespan());
        System.out.println("Behavior: " + dog4.getBehavior());
        System.out.println("Price: " + dog4.getPrice());

         */
        Dog dog = new Dog("Pug", 13, "Hungry", 300);
        Cat cat = new Cat("Tabby", 20, "Angry", 2);

//        dog.setBreed("Pug");
//        cat.setBreed("Tabby");

        System.out.println(dog.getSound());
        System.out.println(dog.getBreed());
        System.out.println(dog.getLifespan());
        System.out.println(dog.getBehavior());
        System.out.println(dog.getPrice());
        System.out.println(cat.getSound());
        System.out.println(cat.getBreed());
        System.out.println(cat.getLifespan());
        System.out.println(cat.getBehavior());
        System.out.println(cat.getPrice());
    }
}
