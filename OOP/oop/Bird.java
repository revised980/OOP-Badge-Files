package OOP.oop;

import OOP.oop.Animal;

public class Bird extends Animal{
    // 1. Complete your Cat class:
    //    - Add the properties "name" and "age"
    //    - Add a constructor that initializes both properties
    //    - Add a makeSound() method that prints "meow"
    public String name;
    public Integer age;

     public Bird(String birdName, Integer birdAge) {
      super(birdName, birdAge);
    }

    public void makeSound() {
        System.out.println("chirp");
    }
}