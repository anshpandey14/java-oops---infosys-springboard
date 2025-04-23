//package Inheritance;

public class Tricycle extends Bike{
    String name;

    public Tricycle(String name,String color){
        super(name,color);
    }

    public Tricycle(){

    }
    @Override
        void makeNoise(){
            System.out.println("Ting...! Ting...! Ting...!");
        }
    
}
