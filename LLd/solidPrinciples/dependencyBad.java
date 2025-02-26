package solidPrinciples;
class Keyboard {
    public void type() {
        System.out.println("Typing");
    }
}
class Computer {
    private Keyboard keyboard;
    public Computer() {
        this.keyboard = new Keyboard();
    }
    public void start (){
        keyboard.type();
    }
}
public class dependencyBad {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();

    }
}
