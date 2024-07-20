import java.util.Arrays;

public class TwoStringsAreClose1657 {
    public static void main(String[] args) {

    }
    static public boolean closeStrings(String word1, String word2) {
    int [] freq1 = new int[26];
    int [] freq2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            char currCh=word1.charAt(i);
            int index = currCh-'a';
            freq1[index]++;
        }
        for (int i = 0; i < word2.length(); i++) {
            char currCh = word2.charAt(i);
            int index = currCh-'a';
            freq2[index]++;
        }

        for (int i = 0; i < freq1.length; i++) {
            if((freq1[i]==0 && freq2[i]!=0) || (freq2[i]!=0 && freq1[i]==0)){
                return false;
            }
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        for (int i = 0; i < freq1.length; i++) {
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}
