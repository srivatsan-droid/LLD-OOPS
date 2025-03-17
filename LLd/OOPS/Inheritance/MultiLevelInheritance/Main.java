package Inheritance.MultiLevelInheritance;

// Separate Main Class for better structure
public class Main {
    public static void main(String[] args) {
        GrandParent obj = new GrandParent();
        obj.show();

        Parent obj1 = new Parent();
        obj1.show();

        Child obj2 = new Child();
        obj2.show();
    }
}
