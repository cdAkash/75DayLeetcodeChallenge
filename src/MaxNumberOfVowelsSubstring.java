public class MaxNumberOfVowelsSubstring {
    public static void main(String[] args) {
    String s = "abciiidef";
    int k=3;
        System.out.println(maxVowels(s,k));
    }
    static public int maxVowels(String s, int k) {
        byte arr[] = new byte[123],str[] = new byte[s.length()];
        s.getBytes(0,s.length(),str,0);
        arr['a'] = arr['e'] = arr['i'] = arr['o'] = arr['u'] = 1;
        int i=0,j=0,max=0,ans=0;
        while(i<k){
            max+=arr[str[i++]];
        }
        ans = max;
        while(i<str.length){
            max+= arr[str[i++]] - arr[str[j++]];
            if(ans<max){
                ans = max;
            }
        }
        return ans;
    }
    static public int maxVowels3(String s, int k){
    int maxNum=0;
        for (int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))){
                maxNum++;
            }
        }
        int currNum=maxNum;
        for (int i = k; i <s.length() ; i++) {
            if(isVowel(s.charAt(i))){
                currNum++;
            }
            if(isVowel(s.charAt(i-k))){
                currNum--;
            }
            maxNum=Math.max(currNum,maxNum);
        }
        return maxNum;
    }


     static public int maxVowels2(String s, int k) {
        //This approach is gonna take O(n^2) time complexity
//         102/106 testcases passed
    int maxNum=0;
    int left=0;
    int right=left+k;
    while(right<=s.length()){
        int vowelCounter=0;
        for (int i = left; i <right  ; i++) {
            if(isVowel(s.charAt(i))){
                vowelCounter++;
            }
        }
        maxNum = Math.max(maxNum,vowelCounter);
        left++;
        right++;
    }

    return maxNum;
    }
    static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
