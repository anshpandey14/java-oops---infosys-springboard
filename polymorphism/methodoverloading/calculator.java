
// /package polmorphism.methodoverloading;

public class calculator{

    // diff. no. of parameters
    void addNumbers(int a,int b){
        int x = a+b;
        System.out.println("a + b = "+x);
    }

    void addNumbers(int a,int b,int c){
        int x = a+b+c;
        System.out.println("a + b = "+x);
    }

    // diff. types of parameters
    void multiplyNumbers(int a,int b){
        int x = a*b;
        System.out.println("a * b = "+x);
    }

    void multiplyNumbers(double a,double b){
        double x = a*b;
        System.out.println("a * b = "+x);
    }
}