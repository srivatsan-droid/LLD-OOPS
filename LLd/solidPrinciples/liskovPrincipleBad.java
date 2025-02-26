package solidPrinciples;
//Subclasses should be replaced with their parents
class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}
class Penguin extends Bird {
    //Penguin cannot fly
}
public class liskovPrincipleBad {

    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.fly();
        Bird obj = new Bird();
        obj.fly();
    }
}
