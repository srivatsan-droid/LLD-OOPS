package Inheritance;

// Main class
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // ✅ Correct way to create Dog object
        myDog.name = "Buddy";
        myDog.eat(); // Inherited from MainParent class
        myDog.bark(); // Defined in Dog class
    }
}
