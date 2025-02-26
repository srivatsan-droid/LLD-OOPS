package solidPrinciples;
interface Worker {
    void work();
    void eat();
}

class Robot implements Worker {
    public void work() {
        System.out.println("Robot working...");
    }

    public void eat() {
        throw new UnsupportedOperationException("Robot does not eat!");
    }
}

public class interfaceBad {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.work();
        robot.eat();
    }
}
