package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class code_20220527 {

/**
02:00
*/

    public static class Cook{
        int time;
        int cnt;
        boolean cooked;
        Cook(int t, int ct, boolean c){
            time = t;
            cnt = ct;
            cooked = c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int M = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        S += M*60;
        int answer = Integer.MAX_VALUE;

        Queue<Cook> q = new LinkedList<>();
        q.add(new Cook(0,0,false));

        while(!q.isEmpty()){
            Cook now = q.poll();

            if(now.time>S) continue;
            if(now.cnt > answer) continue;

            if(now.time == S){
                if(!now.cooked){
                    now.cnt++;
                }
                answer = Math.min(answer, now.cnt);
            }

            q.offer(new Cook(now.time+10,now.cnt+1,now.cooked));
            q.offer(new Cook(now.time+60,now.cnt+1,now.cooked));
            q.offer(new Cook(now.time+600,now.cnt+1,now.cooked));

            if(!now.cooked){
                q.offer(new Cook(now.time,now.cnt+1,true));
            }else{
                q.offer(new Cook(now.time+30,now.cnt+1,true));
            }
        }

        System.out.print(answer);
    }
}
