package OOP.dog; 

public class Dog {
    // 1. Write your properties here. 
    public String name; 
    // add more properties below
    public String breed;
    public Integer age;
    public Integer sitDuration;

    // 2. Fill in the constructor below so that the dog's name is correctly set
    public Dog(String dogName, String dogBreed, Integer dogAge, Integer sitDuration) {
        this.name = dogName;
        // add more initializers below
        this.breed = dogBreed;
        this.age = dogAge;
        this.sitDuration = sitDuration;
    }

    // 3. Write your methods here. 
    public void bark() {
        // Add print statement to bark!
        System.out.println("My name is " + name);
        System.out.println("My breed is " + breed);
        System.out.println("My age is " + age + " years old.");
    }

    public void sit() {
        System.out.println("I have sat for " + sitDuration + " seconds.");
    }
}