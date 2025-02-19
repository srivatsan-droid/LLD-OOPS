class Shape {
    String color;
}
//Inherited the properties and function of a Base Class Shape
class traingle extends Shape{
    int base;
    int height;

}
public class shapeInheritance {
    public static void main(String[] args) {
        traingle t1 = new traingle();
        t1.base =12;
        t1.color = "Red";
        System.out.println(t1.base);
    }
}
