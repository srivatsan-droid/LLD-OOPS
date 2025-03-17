package Inheritance.HierarchicalInheritance;
/*
Single Parent which use the Multiple Child
 */
class SingleParent {
    void show() {
        System.out.println("This is a parent class");
    }
}
class Child1 extends SingleParent {
    void display() {
        System.out.println("This is a child1 class");
    }
}
class Child2 extends SingleParent {
    void display() {
        System.out.println("This is a child2 class");
    }
}
public class SingleParentMultipleChild {
    public static void main(String[] args) {
        SingleParent obj = new SingleParent();
        obj.show();
        Child1 obj1 = new Child1();
        obj1.display();
        Child2 obj2 = new Child2();
        obj2.display();
    }
}
