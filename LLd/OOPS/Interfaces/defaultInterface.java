package Interfaces;

public interface defaultInterface {
    void bake();
    default void prepare(){
        //Default method is nothing but it will be implemented in child class
        System.out.println("Prepare");
    }
}
