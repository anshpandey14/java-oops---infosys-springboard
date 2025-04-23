//package Inheritance;

public class Bike extends Vehicle{

    String name;

    public Bike(String name,String color){
        this.name = name;
        this.color = color;
    }
    public Bike(){

    }
    @Override
        void makeNoise(){
            System.out.println("PEEP....!");
        }
}
