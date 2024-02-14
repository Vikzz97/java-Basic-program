import java.util.ArrayList;

class CollectionDemo{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();

        al.add(100);
        al.add(200);
        al.add(300);
        

        System.out.println(al);

        ArrayList al2 = new ArrayList<>();

        al2.add("aaa");
        al2.add("bbb");
        al2.add("ccc");
        
        al.addAll(al2);
        System.out.println(al);
    }
}