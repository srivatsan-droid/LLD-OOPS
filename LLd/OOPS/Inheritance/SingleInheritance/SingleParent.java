package Inheritance.SingleInheritance;
class parent {
    void show() {
        System.out.println("This is a parent class");
    }
}
class Child extends parent {
    void display() {
        System.out.println("This is a child class");
    }
}
public class SingleParent {
    public static void main(String[] args) {
        parent obj = new parent();
        obj.show();
        Child obj1 = new Child();
        obj1.display();
    }
}
