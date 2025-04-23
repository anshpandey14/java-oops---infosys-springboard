package abstraction;

// Abstract class Calculator
public abstract class calculator {

    // Abstract method for addition (to be implemented by subclasses)
    abstract void add();

    // Concrete method for multiplication
    void multiply() {
        System.out.println("2 * 5 = " + (2 * 5));
    }

    // You can add more operations like subtraction, division, etc.
}
