import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    @SuppressWarnings({ "unchecked", "unused", "rawtypes" })
    public static void main(String[] args) {
        List l = new ArrayList<>();

        l.add(41);
        l.add(42);
        l.add(43);
        l.add(44);
        l.add(44);
        

        // System.out.println(l);
        @SuppressWarnings("rawtypes")
        Iterator itr = l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
    }
}
