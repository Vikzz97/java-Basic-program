package ExceptionHandling;

public class ThrowExample {
    public static void main(String[] args) {
        ThrowExample t = new ThrowExample();
        t.divide(); // yha bhi try-catch lga skte hain 
        System.out.println("hello");
    }
    void divide(){
        try {
            int a=100, b=0, c;
        c = a/b;
        System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
