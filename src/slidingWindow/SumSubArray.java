package slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SumSubArray {
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
