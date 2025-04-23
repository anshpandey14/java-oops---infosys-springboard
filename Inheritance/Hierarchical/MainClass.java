
public class MainClass {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Vehicle vehicle = new Vehicle();
        Tricycle tricycle = new Tricycle();
        bike.name = "BMW";
        bike.color = "Blue";
        tricycle.name = "Fox";
        tricycle.color = "Green";

        System.out.println("Bike name :"+bike.name);
        System.out.println("Bike color :"+bike.color);
        bike.makeNoise();
        vehicle.makeNoise();
        tricycle.makeNoise();
        System.out.println("Tricycle name :"+tricycle.name);
        System.out.println("Tricycle color :"+tricycle.color);
    }
    
}
