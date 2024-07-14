public class MaxConsecutiveOnes {
    public static void main(String[] args) {
    int[] arr={0,0,0,1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    static public int findMaxConsecutiveOnes(int[] nums) {
    int max=0;
    int i=0;
        int currCount=0;
    while(i< nums.length){

        if (nums[i]==1) {
            currCount++;
        }
        if(currCount>max){
            max=currCount;
        }
        if(nums[i]==0){
//            max=Math.max(max,currCount);
            currCount=0;
        }
        i++;
    }
    return max;
    }
}
