package ExceptionHandling;

import java.util.Scanner;

public class ThrowExample2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your age: ");
       int age = s.nextInt();
        try {
            if (age<18) {
                throw new YoungerAge("You are not eligible to vote");// manually Exception Object create krta hai h aur JVM ko pass kr deta hai.
                // System.out.println("h");// compile time exception
            }
            else{
                System.out.println("vote success");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Hello");
    }
}
