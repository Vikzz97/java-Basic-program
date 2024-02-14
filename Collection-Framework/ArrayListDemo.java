import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("vikash");
        al.add("Akash");
        al.add("Himanshu");
        al.add("Ravindra");
        al.add("Deepanshu");
        al.add("Ankit");
        al.add("Sandeep");
        al.add("Babu");
        al.add("Chhota");
        al.add("Somesh");
        al.add("Deepansh");

        // for (String obj : al) {
        //     System.out.print(obj + " ");
        // }

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
