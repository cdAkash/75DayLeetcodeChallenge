import java.util.Arrays;
public class MaxNumberKSUMPairs {
    public static void main(String[] args) {
    int arr[]={1,2,3,4};
    int[] arr2={3,1,3,4,3};
        System.out.println(maxOperations(arr2,6));
    }
    static public int maxOperations(int[] nums, int k) {
    int ans=0;
    Arrays.sort(nums);;
    int left=0;
    int right= nums.length-1;
    while(left<right){
        int currSum=0;
        currSum=nums[left]+nums[right];
        if(currSum<k){
            left++;
        }else if(currSum>k){
            right--;
        }else{
            ans++;
            left++;
            right--;
        }
    }
    return ans;
    }
}
