import java.util.LinkedList;
import java.util.Queue;


public class Dota2Senate649 {
    public static void main(String[] args) {
    String senate = "DRRD";
        System.out.println(predictPartyVictory(senate));
    }

    static public String predictPartyVictory(String senate){
        Queue<Integer> dire = new LinkedList<>();
        Queue<Integer> radiant = new LinkedList<>();
        int n =senate.length();
        for (int i = 0; i < senate.length(); i++) {
            if(senate.charAt(i)=='D'){
                dire.add(i);
            }else{
                radiant.add(i);
            }
        }
        while(!dire.isEmpty() && !radiant.isEmpty()){
            if(dire.peek()< radiant.peek()){
                dire.add(n++);
            }else{
                radiant.add(n++);
            }
            dire.poll();
            radiant.poll();
        }
        if(dire.isEmpty()){
            return "Radiant";
        }else{
            return "Dire";
        }
    }
    static public String predictPartyVictory2(String senate) {
        // this approach passed 80 testcase out of 83
        Queue<Character> q1 = new LinkedList<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < senate.length(); i++) {
            if(q1.isEmpty()){
                q1.add(senate.charAt(i));
            }else{
                if(q1.peek()==senate.charAt(i)){
                    q1.add(senate.charAt(i));
                }else{
                    str.append(q1.poll());
                }
            }
        }
        while(!q1.isEmpty()){
            str.append(q1.poll());
        }
        str.reverse();
        char ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if (q1.isEmpty()){
                q1.add(str.charAt(i));
            }else{
                if(q1.peek()==str.charAt(i)){
                    q1.add(str.charAt(i));
                }else{
                    ans=q1.poll();
                }
            }
        }
        while(!q1.isEmpty()){
            ans=q1.poll();
        }
        if(ans=='R'){
            return "Radiant";
        }else{
            return "Dire";
        }
    }
}
