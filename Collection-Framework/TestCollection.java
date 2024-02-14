import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}

public class TestCollection {
    public static void main(String[] args) {
        Student s1=new Student(101, "vikash", 26);
        Student s2=new Student(102, "Akash", 26);
        Student s3=new Student(103, "Rahul", 25);

        ArrayList<Student> al=new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        Iterator<Student> itr=al.iterator();
        while (itr.hasNext()) {
            Student st=itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
