import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode804 {
    public static void main(String[] args) {
        String [] words={"gin","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(words));
//        System.out.println(convertMorseCode("gin"));
    }
    static public int uniqueMorseRepresentations(String[] words) {

        String[] arr=new String[words.length];
        for (int i = 0; i < words.length; i++) {
            arr[i] = convertMorseCode(words[i]);
        }
        Set<String> targetSet = new HashSet<String>(Arrays.asList(arr));
        return targetSet.size();
    }

    public static String convertMorseCode(String word) {
        HashMap<Character, String> mp = new HashMap<>();
        mp.put('a', ".-");
        mp.put('b', "-...");
        mp.put('c', "-.-.");
        mp.put('d', "-..");
        mp.put('e', ".");
        mp.put('f', "..-.");
        mp.put('g', "--.");
        mp.put('h', "....");
        mp.put('i', "..");
        mp.put('j', ".---");
        mp.put('k', "-.-");
        mp.put('l', ".-..");
        mp.put('m', "--");
        mp.put('n', "-.");
        mp.put('o', "---");
        mp.put('p', ".--.");
        mp.put('q', "--.-");
        mp.put('r', ".-.");
        mp.put('s', "...");
        mp.put('t', "-");
        mp.put('u', "..-");
        mp.put('v', "...-");
        mp.put('w', ".--");
        mp.put('x', "-..-");
        mp.put('y', "-.--");
        mp.put('z', "--..");
        StringBuilder str= new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            str.append(mp.get(word.charAt(i)));
        }
        return str.toString();
    }
}
