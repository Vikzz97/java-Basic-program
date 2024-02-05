package Strings;

public class StringClassMethod {
    public static void main(String[] args) {
        String s1 = "vikashTantuway";
        // String s2 = "vikash";

        // System.out.println(s1.isBlank());
        // System.out.println(s1.isEmpty());
        // System.out.println( s1.concat(s2));

        // StringClassMethod.join();

        System.out.println(s1.length());
        System.out.println(s1.subSequence(2, 6));
        System.out.println(s1.substring(11));
        System.out.println(s1.substring(2,5));

    }
    static void join(){
        String s3 = "vikash";
        String s4 = " Tantuway";
        System.out.println(String.join(" ;",s3,s4));
        System.out.println(s3+s4+10);
        System.out.println(s3+s4+10+20);
        System.out.println(s3+s4+20/10);
        System.out.println(s3+s4+10*20);
       // System.out.println(s3+s4+10-20); // The operator - is undefined for the argument type(s) String, int
    }
}
