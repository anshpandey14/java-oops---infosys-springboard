package polymorphism.methodoverriding;


public class Bike extends Vehicle{
    String name;
    @Override
    void run(){
        System.out.println("My "+this.name+" is running...");
    }
    
}
