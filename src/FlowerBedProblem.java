public class FlowerBedProblem {
    public static void main(String[] args) {
    int arr[]={0,0,1,0,0};
    int n=1;
    boolean ans = canPlaceFlowers(arr,n);
        System.out.println(ans);
    }

    static public boolean canPlaceFlowers(int[] flowerbed, int n){
        if(n==0){
            return true;
        }
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0)){
                flowerbed[i]=1;
                n--;
                if(n==0){
                    return true;
                }
            }
        }
        return false;
    }
    static public boolean canPlaceFlowers2(int[] flowerbed, int n) {
    //This solution passed the 121 testcases/130 testcases.
        boolean ans = false;
    int arrSize=flowerbed.length;
    if(arrSize==2 || arrSize ==3){
        return size23(flowerbed,n);
    }
    int totalPlants;
    if(arrSize%2==0){
        totalPlants=arrSize/2;
    }else{
        totalPlants=arrSize/2+1;
    }
    int count=0;
    for(int i=0;i<flowerbed.length;i++){
        if(flowerbed[i]==1){
            count++;
        }
    }
    int availableEmptySlots=totalPlants-count;
    if (n<=availableEmptySlots){
        ans=true;
    }else{
        ans=false;
    }
    return ans;
    }

    static boolean size23(int[] arr, int n){
        int arrSize=arr.length;
        int available=0;
        if(arrSize==2){
            if(arr[0]==0 & arr[1]==0 & n<=1){
                return true;
            }else{
                return false;
            }
        }
        if(arrSize==3){
            if((arr[0]==1 & arr[2]==1) || arr[1]==1){
                available=0;
            }else if(arr[0]==1 || arr[2]==1){
                available=1;
            }else{
                available=2;
            }
        }
        if(n<=available){
            return true;
        }
        return false;

    }
}
