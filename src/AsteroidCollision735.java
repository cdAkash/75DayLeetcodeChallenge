import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
public class AsteroidCollision735 {
    public static void main(String[] args) {
    int arr[]={10,2,-5};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }
    static public int[] asteroidCollision(int[] asteroids) {
    int n=0;
    Stack<Integer> s1 = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if(s1.empty()){
                s1.push(asteroids[i]);
            }else if(n>0 && asteroids[i]<0){
                    if(n>Math.abs(asteroids[i])){
                        continue;
                    }
                    if(n<Math.abs(asteroids[i])){
                        s1.pop();
                        s1.push(asteroids[i]);
                    }
                    else{
                        s1.pop();
                    }
            }else{
                s1.push(asteroids[i]);
            }
            n=asteroids[i];
        }
        int [] ans=new int[s1.size()];
        for (int a = s1.size()-1; a >=0; a--) {
            ans[a]=s1.pop();
        }
        return ans;
    }
}
