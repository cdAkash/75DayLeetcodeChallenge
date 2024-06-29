

public class alternateString
{
    public static void main(String[] args) {
        String output = mergeAlternately2("abc","pqrrs");
        System.out.println(output);
    }

    static String mergeAlternately(String word1, String word2) {
        int p1=0;
        int p2=0;
        int loop;
        String ans="";

        if(word1.length()>word2.length()){
            loop=word2.length();
        }else{
            loop=word1.length();
        }


        for(int i=0;i<loop;i++){
            ans=ans+word1.charAt(p1);
            p1++;
            ans=ans+word2.charAt(p2);
            p2++;
        }
        if(word1.length()>word2.length()){
            for(int i=p1;i<word1.length();i++){
                ans=ans+word1.charAt(i);
            }
        }else {
            for(int i=p2;i<word2.length();i++){
                ans= ans+word2.charAt(i);
            }
        }

        return ans;
    }

    static public String mergeAlternately2(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}
