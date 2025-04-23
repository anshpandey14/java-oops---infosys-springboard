package abstraction;

abstract class calculator {

    abstract void add();

    void multiply(){
        System.out.println("2 * 5 = " + (2 * 5));
    }
}

class MyCalc extends calculator {

    @Override
    void add() {
        System.out.println("2 + 5 = " + (2 + 5));
    }
}

public class Mainclass {
    public static void main(String[] args) {
        MyCalc cal = new MyCalc();  // ✅ instantiate the subclass
        cal.add();
        cal.multiply();
    }
}
