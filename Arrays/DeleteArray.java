public class DeleteArray {
    public static void main(String[] args) {
        int[] a = {10, 40, 30, 80, 20, 60, 70};

        int delete = 20;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            if (delete == a[i]) {
                for (int j = i; j < a.length-1; j++) {
                    a[j] = a[j+1];
                }
                count=count+1;
                break;
            }
        }
        if (count==0) {
            System.out.println("element not found");
        }else{
            System.out.println("element found successfully");
        }
        for (int i = 0; i < a.length-1; i++) {
            System.out.println(a[i]+ " ");
        }
    }
}
