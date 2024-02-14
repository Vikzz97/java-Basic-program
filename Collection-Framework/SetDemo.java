import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings(" ")
        Set s = new HashSet<>();
        
        s.add(100);
        s.add(200);
        s.add(300);
        s.add(100);
        s.add(200);
        
        // System.out.println(s);
        
    }
}
