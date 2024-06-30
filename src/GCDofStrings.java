import static java.lang.Math.max;

public class GCDofStrings {
    public static void main(String[] args) {
//        System.out.println("aa");
    String str1 = "ABABAB";
    String str2="ABAB";
        System.out.println(gcdOfStrings(str1,str2));

    }
    static public String gcdOfStrings2(String str1, String str2) {
        String ans="";
        String sub = compareMethod(str2);
//        System.out.println(sub);
            if (str1.startsWith(sub)) {
                return sub;
        }
    return "";
    }
    public static String compareMethod(String str2) {
        StringBuilder result = new StringBuilder();
        result = result.append(str2.charAt(0));
        char c1=str2.charAt(0);
        int len=str2.length();
//        while(i<len & str2.charAt(i)!=c1){
//            result=result.append(str2.charAt(i));
//            i++;
//        }
        for(int i=1;i<len;i++){
            if(str2.charAt(i)==c1) {
                return result.toString();
            }else{
                result = result.append(str2.charAt(i));
            }
        }
        return result.toString();
    }

    static public String gcdOfStrings(String str1, String str2) {
        String s1=str1+str2;
        String s2=str2+str1;
        if(!s1.equals(s2)){
            return "";
        }
        int range = GCDrecurrsive(str1.length(),str2.length());
        System.out.println(range);
        return s1.substring(0,range);
    }
    static int GCD(int a, int b){
        int ans=0;
        int len= max(a,b);
        for(int i =1;i<=len;i++){
            if(a%i==0 & b%i==0){
                ans=i;
            }
        }
        return ans;
    }
    static int GCDrecurrsive(int a,int b){
        if(b==0){
            return a;
        }
        return GCDrecurrsive(b,a%b);
    }


}
