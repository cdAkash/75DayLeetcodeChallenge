import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumNumberOfMovesToSeat {
    public static void main(String[] args) {
    int[] ar={3,1,5};
    int[] arr={2,7,4};
        System.out.println(minMovesToSeat(ar,arr));
    }
    static public int minMovesToSeat(int[] seats, int[] students) {
    int count =0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            if(seats[i]==students[i]){
                continue;
            }else if(seats[i]<students[i]){
                while(students[i]!=seats[i]){
                    students[i]--;
                    count++;
                }
            }else{
                while(students[i]!=seats[i]){
                    students[i]++;
                    count++;
                }
            }
        }
        return count;
    }
}
