import java.util.Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        int [] arr={-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }
    static public int largestAltitude(int[] gain) {
        int currSum=0;
        int[]ans = new int[gain.length+1];
        ans[0]=0;
        for (int i = 1; i <= gain.length; i++) {
            currSum=currSum+gain[i-1];
            ans[i]=currSum;
        }
        System.out.println(Arrays.toString(ans));
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < ans.length; i++) {
            if(ans[i]>max){
                max=ans[i];
            }
        }
        return max;
    }
}
