import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    String s1 = "jav";
    String s2 = "va";
        System.out.println(isFfound(s1,s2));
    }
    public static boolean isFfound(String key, String s) {
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < key.length(); j++) {
                if(key.charAt(j)==c){
                    count++;
                }
            }
        }
        if(count==s.length()){
            return true;
        }
        return false;
    }


}