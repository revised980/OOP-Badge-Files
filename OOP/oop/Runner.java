package OOP.oop;

public class Runner {
    public static void main(String[] args) {
        Animal Cat = new Cat("Bob", 2);
        // Cat.makeSound();
        Animal Dog = new Dog("Dan", 3);
        // Dog.makeSound();
        Animal Bird = new Bird("Rob", 4);
        // Bird.makeSound();

        Animal[] animals = {Cat, Dog, Bird};

        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }
        
        Cat.describe();
        Dog.describe();
    }
}
