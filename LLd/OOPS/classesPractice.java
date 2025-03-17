/*
Class : Class is a blueprint or template it defienes attributes and behaviours of an Objects
 */
public class classesPractice {
    //Attributes
    private String color;
    private String make;
    private String model;
    private int year;
    //Constructor
    public classesPractice(String color, String make, String model, int year) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.year = year;
    }
    //Method to Display Car Details
    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    public static void main(String[] args) {
        //Objects are instance of Class.When we are creating an object we are bringing the blueprint of the class into relaity it consist of state and behaviour defiened by class with each object holding its ow copy of the data
        classesPractice car1 = new classesPractice("Red", "Honda", "Civic", 2022);
        car1.displayInfo();
    }
}
