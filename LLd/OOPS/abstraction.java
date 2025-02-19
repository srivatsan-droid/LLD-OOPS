//Abstraction : Hiding the implementation details
abstract class Animal{
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
    public void eat() {
        System.out.println("Eats");
    }
}
class horse extends Animal{
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}
class chicken extends Animal{
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}
public class abstraction {
    public static void main(String[] args) {
        horse n = new horse();
        n.walk();
    }
}
