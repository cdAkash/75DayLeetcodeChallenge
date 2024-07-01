import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {
    public static void main(String[] args) {
   int[] arr= {2,3,5,1,3};
   int extra = 3;
        System.out.println(kidsWithCandies(arr,extra));
    }
   static  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> list1 = new ArrayList<>();
       for(int i=0;i<candies.length;i++){
           list1.add(false);
       }
    int maximum=max(candies);
       for(int i=0;i<candies.length;i++){
           if(candies[i]+extraCandies>=maximum){
               list1.set(i,true);
           }
       }
        return list1;
    }
    static int max(int []arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return  max;
    }
}
