import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
//        Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//        Output: [[1,0,0],[0,1,0],[1,1,1]]
        //first flip it and then invert it
        int [][]arr={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int [][]ans=flipAndInvertImage(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
    static public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i< image.length;i++){
            image[i] = flip(image[i]);
        }
    return image;
    }

    static public int[] flip(int arr[]){
        int start=0;
        int end= arr.length-1;
        int mid = (start+end)/2;
        for(int i=start;i<=mid;i++){
            swap(arr,i,end);
            end--;
        }

        return invert(arr);
    }
    static void swap(int arr[],int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static public int[] invert(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=1;
            }else{
                arr[i]=0;
            }
        }
        return arr;
    }
}
