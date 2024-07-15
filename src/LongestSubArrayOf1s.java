public class LongestSubArrayOf1s {
    public static void main(String[] args) {
int [] arr={0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(arr));
    }
    static public int longestSubarray(int[] nums) {
        int start=0;
        int end=0;
        int zeros=0;
        int k=1;
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
        return (end-start)-1;
    }
}
