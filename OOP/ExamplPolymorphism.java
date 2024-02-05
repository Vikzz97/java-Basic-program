public class ExamplPolymorphism {
    // Overriding & Exception Handling

    void show() throws RuntimeException{
        System.out.println("1");
    }
}
class Xyz extends ExamplPolymorphism{
    void show() throws RuntimeException{
        System.out.println("2");
    }
    public static void main(String[] args) {
        ExamplPolymorphism obj = new ExamplPolymorphism();
        obj.show();

        Xyz x = new Xyz();
        x.show();
    }
}
