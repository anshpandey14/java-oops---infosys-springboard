package Encapsulation;

class car{

    private String carname = "bmw";

    public String getcarname(){
        return this.carname;
    }

    public void setcarname(String name){
        this.carname = name;
    }
}

public class Mainclass {
    
    public static void main(String[] args) {
        car car1 = new car();
        System.out.println("car name is: "+car1.getcarname());
        car1.setcarname("TVS");
        System.out.println("car name is: "+car1.getcarname());
    }
}
