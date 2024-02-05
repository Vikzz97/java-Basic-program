public class ExampleSuperClassA {
    int a = 10;

}
/**
 * InnerExampleSuperClass
 */
class ExampleSuperClassB extends ExampleSuperClassA{
    int a = 20;
    void show(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
    public static void main(String[] args) {
        ExampleSuperClassB b = new ExampleSuperClassB();
        b.show(30);
    }
    
}
