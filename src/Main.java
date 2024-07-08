import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    String[] res= subString("VOMY");
//        System.out.println(Arrays.toString(res));
    String str= 1+"";
        System.out.println(str.charAt(0));
    }

    static String[] subString(String s1){
        String[] arr= new String[s1.length()];
        for(int i =0;i<s1.length();i++){
            arr[i]=s1.substring(0,i+1);
        }
        return arr;
    }
}