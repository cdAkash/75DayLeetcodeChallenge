import java.util.ArrayList;
import java.util.Arrays;

public class IndexSumOfTwoLists599 {
    public static void main(String[] args) {
    String [] a1 = {"Shogun","Piatti","Tapioca Express","Burger King","KFC"};
    String [] a2= {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        System.out.println(Arrays.toString(findRestaurant(a1,a2)));
    }
    static public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> ans = new ArrayList<>();
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            int sum =0;
            for(int j = 0; j < list2.length; j++) {
                if(list1[i].equals(list2[j])){
                    sum = i+j;
                    if(sum==max){
                        max = sum;
                        ans.add(list1[i]);
                    }else if(sum<max){
                        max=sum;
                        if(ans.isEmpty()){
                            ans.add(list1[i]);
                        }else{
                            int LastIndex = ans.size()-1;
                            ans.remove(LastIndex);
                            ans.add(list1[i]);
                        }
                    }
                }


            }
        }
        String [] arr = new String[ans.size()];
        for (int i =0; i<arr.length;i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
}
