public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int []arr={20,100,10,12,5,13};
        int[]arr2={6,7,1,2};
        System.out.println(increasingTriplet(arr));
    }
     static public boolean increasingTriplet(int[] nums) {
   int smallest=Integer.MAX_VALUE;
   int secSmall=Integer.MAX_VALUE;
         for (int i = 0; i < nums.length; i++) {
             if(nums[i]<=smallest){
                 smallest=nums[i];
             }
             else if(nums[i]<=secSmall){
                 secSmall=nums[i];
             }
             else{
                 return true;
             }
         }
    return false;
    }
}
