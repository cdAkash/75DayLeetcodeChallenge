import static java.lang.Math.min;

public class ContainerWithMostWater {
    public static void main(String[] args) {
    int [] arr= {1,8,6,2,5,4,8,3,7};
    int [] arr2={2,3,4,5,18,17,6};
        System.out.println(maxArea(arr2));
    }
    static public int maxArea(int[] height) {
    int max=0;
    int i=0;
    int j= height.length-1;
    while(i<j){
        int len=0;
        int breadth=0;
        len=j-i;
        if(height[i]>0 && height[j]>0) {
            breadth = min(height[i], height[j]);
        }
        int product=len*breadth;
        if(product>max){
            max=product;

        }
        if(height[i]<=height[j]){
            i++;
        }else{
            j--;
        }
    }
    return max;
    }
}
