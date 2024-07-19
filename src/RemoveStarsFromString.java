import java.util.*;
public class RemoveStarsFromString {
    public static void main(String[] args) {
        String s="leet**cod*e";
        System.out.println(removeStars(s));
    }
    static public String removeStars(String s) {
        Stack<String> s1 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='*'){
                s1.push(String.valueOf(s.charAt(i)));
            }else{
                s1.pop();
            }
        }
        int size=s1.size();
        if(size==0){
            return "";
        }

        StringBuilder ans= new StringBuilder();
        for (int i = 0; i < size; i++) {
            ans.append(s1.pop());
        }
        return ans.reverse().toString();
    }
}
