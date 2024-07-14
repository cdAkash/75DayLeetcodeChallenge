public class MaxConsecutiveOnes3 {
    public static void main(String[] args) {
    int[] arr={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
    int[] arr2={1,1,1,0,0,0,1,1,1,1,0};
    int k=3;
        System.out.println(longestOnes(arr,k));
    }
    static public int longestOnes(int[] nums, int k) {

            int start=0;
            int end=0;
            int zeros=0;

            while(end<nums.length){
                if(nums[end] == 0){
                    zeros++;
                }
                end++;
                if(zeros>k){
                    if(nums[start] == 0){
                        zeros--;
                    }
                    start++;
                }
            }
            return end-start;

    }
}
