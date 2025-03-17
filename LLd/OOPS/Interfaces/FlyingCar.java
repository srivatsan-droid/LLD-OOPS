package Interfaces;

public class FlyingCar implements Flyable, Drivable {
    @Override
    public void fly() {
        System.out.println("Flying Car");
    }

    @Override
    public void drive() {
        System.out.println("Driving Car");
    }

    public static void main(String[] args) {
        FlyingCar car = new FlyingCar();
        car.fly();
        car.drive();
    }
}
