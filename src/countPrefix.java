public class countPrefix {
    public static void main(String[] args) {
        String [] words = {"a","b","c","ab","bc","abc"};
        String [] words2= {"feh","w","w","lwd","c","s","vk","zwlv","n","w","sw","qrd","w","w","mqe","w","w","w","gb","w","qy","xs","br","w","rypg","wh","g","w","w","fh","w","w","sccy"};
        String [] words3={"ycwj","hak","v","kjg","zw","vtes","vom","ii","as","v","vo","v","w","vomy","loa","fbm","j","v","vo","e","y","t","eh","yk","bt","x","vomy","vom","yab","v","sydi","wnb","z","v","iygp","vomy"};
        String s="vomy";

//        System.out.println(s.charAt(0));
        int ans = countPrefixesAdvance(words3,s);
        System.out.println(ans);
    }
// arr[i].size()<=s.size()
   static public int countPrefixes2(String[] words, String s) {
        int res=0;
        for(int i=0;i<words.length;i++) {
            if(words[i].length()<=s.length()) {
                if (words[i].charAt(0) == s.charAt(0)) {
                    res++;
                }
            }
        }
    return res;
    }

    static public int countPrefixes(String[] words, String s){
        int res=0;
        String []SubStrings=subString(s);
        for(int i=0;i<SubStrings.length;i++){
            for(int j =0;j<words.length;j++){
                if(SubStrings[i].equals(words[j])){
                    res++;
                }
            }
        }
        return res;
    }

    static String[] subString(String s1){
        String[] arr= new String[s1.length()];
        for(int i =0;i<s1.length();i++){
            arr[i]=s1.substring(0,i+1);
        }
        return arr;
    }

    static public int countPrefixesAdvance(String[] words, String s) {
        int count = 0;
        for (String i : words)
            if (s.startsWith(i)) count++;
        return count;
    }
}
