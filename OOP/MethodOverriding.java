public class MethodOverriding {
    
    /* condtions which satisfy to MethodOverriding
     * name of method should be same
     * classes should be different
     * 
     * same arguments : 
     * 1. no. of arguments same
     * 2. sequence of argument should be same
     * 3. different class
     * 4. Inheritance (IS-A)
     */
    void showw(){
        System.out.println("method1");
    }
}
class Override extends MethodOverriding{
    // @Override
    void showw() {
        System.out.println("method2");

    }
    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        // ((MethodOverriding)obj).showw(); //upcasting
        obj.showw();

        Override obj1 =new Override();
        obj1.showw();

    }
}
