abstract class ExamplePolymorphism_2 {
    
    //  Overriding and Abstract Method
    /* Abstact methods in an interface or astract class are meant to be       overridden in derived concrete classes otherwise compile-time error will be thrown */
     
    abstract void display();
    void show() throws RuntimeException{
        System.out.println("1");
    }
}
class Xyz extends ExamplePolymorphism_2{

    void display(){

    }
    void show(){
        System.out.println("2");
    }
    public static void main(String[] args) {
        // ExamplePolymorphism_2 obj = new ExamplePolymorphism_2();
        // obj.show();

        Xyz obj1 = new Xyz();
        obj1.show();
    }
}