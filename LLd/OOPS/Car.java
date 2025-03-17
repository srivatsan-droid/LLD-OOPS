public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car has been started");
    }
    @Override
    public void stop() {
        System.out.println("Car is Stopping");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}
