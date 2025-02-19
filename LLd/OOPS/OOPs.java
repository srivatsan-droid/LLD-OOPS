class Pen {
    String color;
    String type;

    //Function or method
    public void write() {
        System.out.println("Writing Something");
    }
    public void printColor() {
        System.out.println(this.color);
    }

}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println("My Name is : " + this.name + " " + "My Age is : " + this.age);
    }
    //Non - parameterized constructor/Default constructor
    Student () {
        System.out.println("Consturctor Called");
    }
    //Parameterized constructor
    Student (String name, int age) {//Parameter is Name,age which is passed in the base class and we wil be referencing it
        this.name = name;
        this.age = age;
    }
    //Copy Constructor
    Student(Student s2)  {
        this.name = s2.name;
        this.age = s2.age;
    }
    public void printInfo(int age) {
        System.out.println(age);
    }
    public void printInfo(String name,int age) {
        System.out.println(name + " " + age);
    }
}
public class OOPs {
    public static void main(String[] args) {
        Pen obj = new Pen();
        obj.color = "Blue";
        obj.type = "Ball Point";
        obj.write();
        Pen obj2 = new Pen();
        obj2.color = "Red";
        obj2.type = "Ball Point";
        obj2.write();
        obj.printColor();
        obj2.printColor();
        //Java has its own constructor
        //Default Constructor
        Student s1 = new Student();//New Keyword which is memory allocation happens fo this particular object
        //s1 is a reference variable this is also an special function which is named as Constructor
        //Types of constructors
        s1.name = "Srivatsan";
        s1.age = 20;
        s1.printInfo();
        //Parameterized Constructor
        Student s2 = new Student("Sri",23);
        s2.printInfo();
        //Copy Constructor
        Student s3 = new Student(s2);
        System.out.println(s3);
        s1.printInfo(24);
    }
}
