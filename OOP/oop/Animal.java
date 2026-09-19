package OOP.oop;

public class Animal {
    // 3. Complete your Animal class:
    //    - Look at what properties & methods are shared between Cat.java and Dog.java. Add them in here
    //    - Add a constructor that initializes each property

    private String name;
    private Integer age;

     public Animal(String animalName, Integer animalAge) {
        this.name = animalName;
        this.age = animalAge;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer newAge) {
        this.age = newAge;
    }
    
    public void makeSound() {
        System.out.println("animal sound");
    }
    
    public void describe() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }
}