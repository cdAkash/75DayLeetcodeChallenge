public class EqualRowAndColPairs2352 {
    public static void main(String[] args) {
    int [][] arr = {{3,2,1},{1,7,6},{2,7,7}};
        System.out.println(equalPairs(arr));
    }
    static public int equalPairs(int[][] grid) {
    int count=0;
    for(int row=0;row<grid.length;row++){
        int k=0;
        while(k< grid[row].length){
            int temp=0;
            for(int col=0;col< grid[row].length;col++){
                if(grid[row][col]!=grid[col][k]){
                    break;
                }
                temp++;
            }
            if(temp== grid[row].length){
                count++;
            }
            k++;

        }
    }
    return count;
    }
}
