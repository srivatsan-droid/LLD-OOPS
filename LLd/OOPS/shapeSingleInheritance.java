import java.util.*;
class Shape1 {
    public void area () {
        System.out.println("displayes area");
    }
}
class Triangle extends Shape1 {
    public void area(int len,int height) {
        System.out.println("Area of Traingle is : " + 0.5 * len * height);
    }
}
//Derived class of traingle
class EquilateralTraingle extends Triangle {
    public void area1(int len, int height) {
        System.out.println(len * height);
    }
}
class Circle extends Shape1 {
    public void area(int radius) {
        System.out.println("Area of Circle is : " + 3.14 * radius * radius);
    }
}
public class shapeSingleInheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(10, 20);
        EquilateralTraingle t2 = new EquilateralTraingle();
        t2.area1(10, 20);
        Circle c1 = new Circle();
        c1.area(10);

    }
}
