import java.util.Arrays;

public class PivotIndex {
    public static void main(String[] args) {
        int [] arr={1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
    static public int pivotIndex(int[] nums) {
    int [] prefix = new int[nums.length];
    int [] suffix = new int[nums.length];
    int currSum=0;
        for (int i = 0; i < prefix.length; i++) {
            currSum=currSum+nums[i];
            prefix[i]=currSum;
        }
        currSum=0;
        for (int i = nums.length-1; i >=0 ; i--) {
            currSum=currSum+nums[i];
            suffix[i]=currSum;
        }
//        System.out.println(Arrays.toString(suffix));
        int leftSum=0;
        int rightSum=0;
        for (int i = 0; i < nums.length; i++) {
            leftSum=prefix[i]-nums[i];
            rightSum=suffix[i]-nums[i];
            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }
}
