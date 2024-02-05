// package OOP;
// constructor is used to initialize an object.
public class ConstructorExample {
    String name;
    int emp_id;

    ConstructorExample(String name, int emp_id){
        this.name  = name;
        this.emp_id = emp_id;
    }
}
class constructorName extends ConstructorExample {
    constructorName(String name, int emp_id) {
        super(name, emp_id);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        ConstructorExample c1 = new ConstructorExample("vikash", 1);
        System.out.println("Employee Name: " +c1.name );
        System.out.println("Employee Id: " +c1.emp_id );
        
    }
}

