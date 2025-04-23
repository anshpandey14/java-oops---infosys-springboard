interface Animal {
    void test();
}

class Dog implements Animal {
    public void test() {
        System.out.println("Interface method implemented");
    }
}

public class car {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.test();
    }
}
