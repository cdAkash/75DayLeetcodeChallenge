import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class KeyboardRow500 {
    public static void main(String[] args) {
    String[] str = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(str)));
//        System.out.println(removeDuplicate());
    }
    static public String[] findWords(String[] words) {
        String[] input ={"qwertyuiop","asdfghjkl","zxcvbnm"} ;
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
//            words[i]=words[i].toLowerCase();
            String s = removeDuplicate(words[i].toLowerCase().toCharArray(),words[i].length());
            boolean found=false;
            for (int j = 0; j < input.length; j++) {
                if(isFound(input[j],s)){
                    ans.add(words[i]);
                }
            }

        }
        String[] output = new String[ans.size()];
        for (int i = 0; i < output.length; i++) {
            output[i]=ans.get(i);
        }
        return output;
    }

    private static boolean isFound(String key, String s) {
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

    static String removeDuplicate(char str[], int n)
    {
        int index = 0;
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
}
