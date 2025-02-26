package solidPrinciples;
interface Bird1 {
    void eat();
}
interface flyingBird extends Bird1 {
    void fly();
}
class Sparrow implements flyingBird {
    public void eat() {
        System.out.println("Eating seeds");
    }
    public void fly() {
        System.out.println("Flying...");
    }
}
class Penguin1 implements Bird1 {
    public void eat() {
        System.out.println("Eating fish");
    }
}
public class liskovPrincipleGood {
    public static

    void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.eat();
        Penguin1 penguin = new Penguin1();
        penguin.eat();
    }
}
