

/*
 * 
 * if following condtions satisfies then  
 * Method Overloading 
 * 
 * name should be same 
 * within same classes 
 * different arguments
 * 1.no. of arg
 * 2.sequence of arg
 * 3.type of arg
 */
public class PolymorphismExample {

    // Method Overloading Case - 1
    // void show(int a){
    //     System.out.println("int method");
    // }
    // void show(Object a){
    //     // System.out.println("int method");
    //     System.out.println("object method");
    // }
    // void show(int a, float b){
    //     // System.out.println("int method");
    //     System.out.println("int float method");
    // }
    void show(StringBuffer a){
        // System.out.println("int method");
        // System.out.println("int float method");
        System.out.println("String buffer method");
    }
    // void show(String a){
    //     System.out.println("String method");
    // }
    void show(float a, int b){
        System.out.println("float int method");
    }
    public static void main(String[] args) {
        PolymorphismExample pe = new PolymorphismExample();
        // pe.show(5);
        // pe.show('a'); // int method : automatic promotion
        // pe.show("aahj");

        pe.show(new StringBuffer("vikash"));
        pe.show(10.45f, 41);
    }
    
}
