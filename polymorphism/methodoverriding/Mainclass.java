package polymorphism.methodoverriding;

public class Mainclass {
   public static void main(String[] args) {
    Bike bike = new Bike();
    bike.name = "hero";
    bike.color = "Red";

    System.out.println("Bike name: "+ bike.name);
    System.out.println("Bike color: "+bike.color);
    bike.run();
   } 
}
