public class ISsubsequence {
    public static void main(String[] args) {
    String s1="b";
    String s2="abc";
        System.out.println(isSubsequence(s1,s2));
    }
    static public boolean isSubsequence(String s, String t){
        int i=0;
        int j=0;
        int s1= s.length();
        int t1= t.length();
        if(t1<1){
            return true;
        }
        while(i<s1){
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
            i++;
            if(i==s1){
                return true;
            }
        }
        return false;
    }





    static public boolean isSubsequence3(String s, String t) {
        if(s.isEmpty()){
            return false;
        }
    int i=0;
    int j=0;
    while(i<s.length()){
        if(s.charAt(i)==t.charAt(j)){
            i++;
        }
        j++;
        if(i==s.length()){
            return true;
        }
    }

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
