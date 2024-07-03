public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels(("ia")));
        System.out.println(reverseVowels2(("ia")));
    }
    static public String reverseVowels(String s) {
//        This algo taking O(n^2) time complexity
        if(s.isEmpty()){
            return s;
        }
        char [] charArr=s.toCharArray();
    return new String(reverseArr(charArr));
    }
    static public String reverseVowels2(String s){
//        Meanwhile this algo taking O(n) time complexity
        char[] chArr=s.toCharArray();
        int end=s.length()-1;
        int start=0;
        int ss=0;
        int es=0;
        while(start<end){
            if(ss==0 && isVowel(chArr[start])){
                ss=1;
            }
            if(es==0 && isVowel(chArr[end])){
                es=1;
            }
            if(ss==1 && es==1){
                swap(chArr,start,end);
                ss=0;
                es=0;
            }
            if(ss==0) start++;
            if(es==0) end--;
        }
        s=new String(chArr);
        return s;
    }
    private static char[] reverseArr(char[] arr) {
        int end= arr.length-1;
        for(int i=0;i< arr.length;i++){
            if(isVowel(arr[i])) {
               while(end>i) {
                    if(isVowel(arr[end])){
                        swap(arr,i,end);
                        end--;
                        break;
                    }else{
                        end--;
                    }
                }
            }
        }
        return arr;
    }

    static boolean isVowel(char ch){

        char c = Character.toUpperCase(ch);
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    static void swap(char[] arr,int first,int second){
    char temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
    }
}
