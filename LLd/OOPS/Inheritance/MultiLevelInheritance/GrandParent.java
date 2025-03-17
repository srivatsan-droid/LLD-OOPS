package Inheritance.MultiLevelInheritance;

public class GrandParent {
    void show() {
        System.out.println("GrandParent is the Ancestor Class");
    }
}

class Parent extends GrandParent {
    void show() {
        System.out.println("Parent is the Child Class of GrandParent");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child is the Child Class of Parent");
    }
}

