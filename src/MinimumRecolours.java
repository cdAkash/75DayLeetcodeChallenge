public class MinimumRecolours {
    public static void main(String[] args) {
    String blocks = "WBWBBBW";
    int k=2;
        System.out.println(minimumRecolors(blocks,k));
    }
    static public int minimumRecolors(String blocks, int k) {
    int count=0;
        for (int i = 0; i < k; i++) {
            if(blocks.charAt(i)=='W'){
                count++;
            }
        }
        int currCount=count;
        for (int i = k; i < blocks.length(); i++) {
            if(blocks.charAt(i)=='W'){
                currCount++;
            }
            if (blocks.charAt(i-k)=='W'){
                currCount--;
            }
            count=Math.min(count,currCount);
        }
        return count;

    }
}
