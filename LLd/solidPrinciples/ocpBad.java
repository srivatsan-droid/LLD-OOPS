package solidPrinciples;
/*
Open/Closed Principle
A Class should be open for Extension and closed for
 */
class rectangle {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class circle {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
//Issue with this function is that everytime a new shape is present we need to modify the class shapePrinter which is violating the rule of OCP Open for extension closed for modification
class shapePrinter {
    public void printShape(Object shape) {
        if(shape instanceof rectangle) {
            ((rectangle) shape).draw();
        }
        else if(shape instanceof circle) {
            ((circle) shape).draw();
        }
    }
}
public class ocpBad {
    public static void main(String[] args) {
        shapePrinter printer = new shapePrinter();
        printer.printShape(new rectangle());
    }
}
