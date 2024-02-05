public class ArrayPractice {
    public static void main(String[] args) {
        // int emp_Id[] = new int[0]; // Array Declaration + Array Creation
        // String emp_name[] = new String[100];

        // int[] a = new int[5];

        // a[0] = 10;
        // a[1] = 20;
        // a[2] = 30;

        int[] b = {10, 20, 30};
        // for (int i = 0; i < b.length; i++) {
        //     System.out.println(b[i]);
        // }
        for (int i : b) {
            System.out.println(i+",");
        }       
    }
}
