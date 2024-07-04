import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String s= "the sky is blue";
//        System.out.println(s.length());
//        A-Z is 65-90, a-z is 97-122. [0 – 9] ranges from [48 – 57]
        System.out.println(reverseWords2(s));


    }
     static public String reverseWords(String s) {
         ArrayList<String> stringList = new ArrayList<>();
         int i=0;
         boolean spaceOrNot;
         while(i<s.length()){
             if(isSpace(s.charAt(i))) {
                 spaceOrNot = true;
                 i++;
             }else{
                 spaceOrNot=false;
             }
             StringBuilder s2= new StringBuilder();
             while(spaceOrNot==false && i<s.length()){
                 if(isSpace(s.charAt(i))){
                    spaceOrNot=true;
                 }else{
                     s2.append(s.charAt(i));

                 }
                 i++;
             }
             if(!s2.isEmpty()){
//                 System.out.println(s2);
                 stringList.add(s2.toString());
             }

         }
//         System.out.println(stringList);
         return reverseArr(stringList);
    }

    static public boolean isSpace(char c){
        int a=(int)c;
        if((a>=48 && a<=57)||(a>=65 && a<=90) || (a>=97 && a<=122)){
            return false;
        }
        return true;
    }
    static String reverseArr(ArrayList<String> s1){
        StringBuilder s2= new StringBuilder();
        for (int i = s1.size()-1; i >=0 ; i--) {
            s2.append(s1.get(i)).append(" ");

        }
        return s2.toString().trim();
    }

        static public String reverseWords2(String s) {
            String result=s.trim();
            StringBuffer se=new StringBuffer();
            String[] arrstr=result.split("\\s+");
            for(int i = arrstr.length-1 ;i>=0;i--)
            {
                se.append(arrstr[i]).append(" ");
            }
            return se.toString().trim();

        }
}
