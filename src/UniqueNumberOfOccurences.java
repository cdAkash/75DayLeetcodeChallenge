import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurences {
    public static void main(String[] args) {
    int [] arr={-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }
    static public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        HashSet<Integer> a1= new HashSet<>();
        for(int n:arr){
            a1.add(n);
        }
        for(int n:a1){
            ans.put(n,0);
        }

        for(int n:arr){
            int temp = ans.get(n);
            temp++;
            ans.replace(n,temp);
        }
        HashSet<Integer> a2 = new HashSet<>(ans.values());
        return a2.size() == a1.size();
    }
}
