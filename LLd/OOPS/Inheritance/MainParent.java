package Inheritance;

// Parent class
public class MainParent {
    String name;
    void eat() {
        System.out.println(name + " is eating as a hobby.");
    }
    void sleep() {
        System.out.println(name + " is sleeping as a hobby.");
    }
}

// Child class (moved outside the MainParent class)
class Dog extends MainParent {
    void bark() {
        System.out.println(name + " is barking...");
    }
}

