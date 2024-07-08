import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int [] arr={0,-1,0,-3,12};
        int[]arr2={0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    static public void moveZeroes(int[] nums){
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]!=0){
                swap(nums,i,j);
                i++;
                j++;
            }else{
                j++;
            }
        }
    }

    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static  public void moveZeroes2(int[] nums) {
        if(nums.length==1){
            return;
        }
        for (int i = 0; i < nums.length/2; i++) {
            int k=1;
            for (int j = 0; j < nums.length-k; j++) {
                if(nums[j]==0){
                    swap(nums,j,j+1);
                }
            }
            k++;
        }
    }
}
