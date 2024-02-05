// package OOP;

public class A {
    
    void showA(){
        System.out.println("a class");
    }
}
/**
 * B
 */
class B extends A {

    void showB(){
        System.out.println("b class");
    }

    public static void main(String[] args) {
        A obj1 = new A();
        obj1.showA();

        B obj2 = new B();
        obj2.showB();
    }
}

