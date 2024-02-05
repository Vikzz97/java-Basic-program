// import java.lang.reflect.Array;
import java.util.Arrays;

class Solution{
    public int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] {i, j};
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(Arrays.toString(s.twoSum(new int[]{
            2,7,11,15},9)));//[0,1]
            System.out.println(Arrays.toString(s.twoSum(new int[]{
                3,2,4},6)));//[1,2]

    }
}
