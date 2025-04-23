//package Inheritance;

public class MainClass {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Vehicle vehicle = new Vehicle();
        Tricycle tricycle = new Tricycle();
        bike.name = "BMW";
        bike.color = "Blue";

        System.out.println("Bike name :"+bike.name);
        System.out.println("Bike color :"+bike.color);
        bike.makeNoise();
        vehicle.makeNoise();
        tricycle.makeNoise();
    }
    
}
