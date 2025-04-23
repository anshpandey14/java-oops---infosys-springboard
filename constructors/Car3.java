// Parameterized Constructors
public class Car3 {
    String name;

    Car3(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        Car3 carobj1 = new Car3("BMW");
        System.out.println(carobj1.name);
         Car3 carobj2 = new Car3("Honda");
        System.out.println(carobj2.name);
    }
}
