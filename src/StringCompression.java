
import java.util.ArrayList;
import java.util.Arrays;


public class StringCompression {
    public static void main(String[] args) {
    char[] c = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
    char[] c2={'a'};
        char[] c3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        char[] c4={'1','2','2'};
        char[] c5 = {'a', 'a', 'b', 'b', 'a', 'a'};
        System.out.println(compress(c5));
        System.out.println(Arrays.toString(c5));
    }

    static public int compress(char[] chars) {
        int i=0;
        StringBuilder str= new StringBuilder();
        while(i<chars.length) {
            int count=1;
            char match=chars[i];
            str.append(chars[i]);
            int j=i+1;
            int k= chars.length;
            while(j< k && chars[j]==match){
                count++;
                j++;
            }
            if(count>1){
                String num = count + "";
                if(count>9){
                    int digit=0;
                    while(digit<num.length()){
                        str.append(num.charAt(digit));
                        digit++;
                    }
                }else{
                    str.append(num.charAt(0));
                }
            }
            i=j;
        }
        for (int j = 0; j < str.length(); j++) {
            chars[j]=str.charAt(j);
        }
        System.out.println(str);
        return str.length();
    }
    static public int compress2(char[] chars) {
    ArrayList<String> arr=new ArrayList<>();
    int i=0;
        while(i<chars.length) {
            int count=1;
            char match=chars[i];
            arr.add(String.valueOf(chars[i]));
            int j=i+1;
            int k= chars.length;
            while(j< k && chars[j]==match){
                count++;
                j++;
            }
            if(count>1){
                if(count>9){
                    int firstDigit = count / 10;  // Get the first digit
                    arr.add(String.valueOf(firstDigit));
                    int secondDigit = count % 10; // Get the second digit
                    arr.add(String.valueOf(secondDigit));
                }else{
                    arr.add(String.valueOf(count));
                }
            }
            i=j;
        }
        System.out.println(arr);
    return arr.size();
    }


}
