package Inheritance.MethodOverriding;
/*
Method Overriding is a concept where the child class can redefiene a method from the parent class
 */
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}
public class OverridingMethod {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
