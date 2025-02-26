package solidPrinciples;
interface InputDevice {
    void type();
}
class keyword implements InputDevice{
    public void type() {
        System.out.println("Typing");
    }
}
class Computer1 {
    private InputDevice inputDevice;
    public Computer1(InputDevice inputDevice) {
        this.inputDevice = inputDevice;
    }
    public void start() {
        inputDevice.type();
    }
}
public class dependencyGood {
    public static void main(String[] args) {
        Computer1 computer = new Computer1(new keyword());
        computer.start();
    }
}
