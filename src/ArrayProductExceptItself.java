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
}
