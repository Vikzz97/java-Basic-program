public class AnonymousArray {
    public static void main(String[] args) {
        AnonymousArray.sum(new int[]{10,20,30});
    }
    static void sum(int[] num){
        int total = 0;
        for (int i : num) {
            total = total + i;
        }
        System.out.println(total);
    }
}
