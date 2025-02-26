package solidPrinciples;
interface Shape {
    void draw();
}
//Now, adding a new shape doesn’t modify existing code—just extend the Shape interface.
class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
public class ocpGood {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.draw();
        shape = new Circle();
        shape.draw();
    }
}
