public class ISsubsequence {
    public static void main(String[] args) {
    String s1="axc";
    String s2="ahbgdc";
        System.out.println(isSubsequence(s1,s2));
    }
    static public boolean isSubsequence(String s, String t) {
    


        return false;
    }
    static public boolean isSubsequence2(String s, String t) {
        // 12/20 testcase passed but this approach won't work
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            char currChar=s.charAt(i);
            for (int j = 0; j < t.length(); j++) {
                if(currChar==t.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        if(count==s.length()){
            return true;
        }
//        System.out.println(count);
    return false;
    }
}
