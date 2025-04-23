
//package polmorphism.methodoverloading;

public class Mainclass {
    public static void main(String[] args) {
        calculator calc = new calculator();

        calc.addNumbers(5, 6);
        calc.addNumbers(1,2,3);
        calc.multiplyNumbers(2, 3);
        calc.multiplyNumbers(2.2, 5.5);
    }
}
