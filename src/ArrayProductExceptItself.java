import java.util.ArrayList;
import java.util.Arrays;

public class ArrayProductExceptItself {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
        System.out.println(Arrays.toString(productExceptSelf2(arr)));
    }

    static public int[] productExceptSelf(int[] nums) {
//        Input: nums = [-1,1,0,-3,3]
//        Output: [0,0,9,0,0]
        int n = nums.length;
        int[] product = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 1;
        suffix[n - 1] = 1;
//        for(int i=1;i<n;i++){
//            prefix[i]=prefix[i-1]*nums[i-1];
//        }
//        for (int i = n-2; i>=0; i--) {
//            suffix[i]=suffix[i+1]*nums[i+1];
//        } usnig single while loop insted of 2 for loops
        int i = 1;
        int j = n - 2;
        while (i < n || j >= 0) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
            suffix[j] = suffix[j + 1] * nums[j + 1];
            i++;
            j--;
        }
        for (int k = 0; k < n; k++) {
            product[k] = prefix[k] * suffix[k];
        }
        return product;
    }

    static public int[] productExceptSelf2(int []nums){
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }

    public static class SumSubArray {
        public static void main(String[] args) {
            int [] arr={1,2,3,7,5};
            int k=4;
            System.out.println(sum(arr,k));
            int sum = sum(arr,4);
            int n = arr.length;
            System.out.println(subarraySum(arr,n,sum));
        }
        static int sum(int []arr,int k){
            int sum=0;
            int i=0;
            int j=k-1;
            while(j< arr.length){
                int currSum=0;
                int x=i;
                while(x<=j){
                    currSum+=arr[x];
                    x++;
                }
                if(currSum>sum){
                    sum=currSum;
                }
                i++;
                j++;
            }
            return sum;
        }
        static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
            // Your code here
            ArrayList<Integer> a1= new ArrayList<>();

            int k=2;
            while(k<arr.length){
                int i=0;
                int j=k-1;
            while(j< arr.length) {
                int currSum = 0;
                int x = i;
                while (x <= j) {
                    currSum += arr[x];
                    x++;
                }
                if (currSum == s) {
                    a1.add(i);
                    a1.add(j);
                    return a1;
                }
                i++;
                j++;
            }
                k++;
            }
            return a1;
        }
    }
}
