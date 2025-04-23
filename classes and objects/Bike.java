// class
public class Bike {
    String name;
    String color;
    public static void main(String[] args) {
        // object creation
        Bike newBike = new Bike();
        newBike.name = "BMW";
        newBike.color = "Blue";
        System.out.println("Model: "+newBike.name);
        System.out.println("color: "+newBike.color);
    }
    public void makeNoise() {
    }
}
