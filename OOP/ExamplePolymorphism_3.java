public class ExamplePolymorphism_3 {
    
    synchronized void show(){
        System.out.println("1");
    }
}
class Xyz1 extends ExamplePolymorphism_3{
    
    void show(){
        System.out.println("2"); // 2
        // super.show();
    }
    public static void main(String[] args) {
        
        ExamplePolymorphism_3 x0 = new ExamplePolymorphism_3();
        x0.show();
        
        Xyz1 x1 = new Xyz1();
        x1.show();
    }
}
