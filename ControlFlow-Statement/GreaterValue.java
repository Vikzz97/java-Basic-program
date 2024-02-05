public class GreaterValue{
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30, d =40;
        if (a>b) {
            if (b>c) {
                if (c>d) {
                    if (d>a) {
                        System.out.println("a is greater");
                    }
                    else{
                        System.out.println("d is greater");
                    }
                }
            }
        }
        else if (b>d) {
            System.out.println("b is greater");
        }
        else{
            System.out.println("d is greater");
        }
    }
}