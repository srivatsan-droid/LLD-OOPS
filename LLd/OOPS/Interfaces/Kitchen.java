package Interfaces;

public class Kitchen implements defaultInterface{

    @Override
    public void bake() {
        System.out.println("Baking the food");
    }

    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        kitchen.bake();
        kitchen.prepare();
    }

}
