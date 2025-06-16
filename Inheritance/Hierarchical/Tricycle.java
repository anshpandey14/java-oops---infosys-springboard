

public class Tricycle extends Vehicle{
    String name;

    public Tricycle(String name,String color){
        this.name = name;
        this.color = color;
    }

    public Tricycle(){

    }
    @Override
        void makeNoise(){
            System.out.println("Ting...! Ting...! Ting...!");
        }
    
}
