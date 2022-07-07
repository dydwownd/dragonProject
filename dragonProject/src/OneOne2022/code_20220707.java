package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.*;

public class code_20220707 {
//23815
/**
3
+3 *6
-8 -9
-9 -9
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{1,0});
        int answer = 0;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            String first = st.nextToken();
            String second = st.nextToken();
            int size = q.size();

            while(size>0){
                size--;
                int[] now = q.poll();
                int calc1 = calc(now[0],first.charAt(0),Integer.parseInt(first.substring(1,2)));
                int calc2 = calc(now[0],second.charAt(0),Integer.parseInt(second.substring(1,2)));
                if(calc1 < now[0] && calc2 < now[0] && now[1] == 0){
                    q.offer(new int[]{now[0],1});
                }
                q.offer(new int[]{Math.max(calc1,calc2),now[1]});
            }
        }

        while(!q.isEmpty()){
            int[] now = q.poll();
            answer = Math.max(answer,now[0]);
        }

        if(answer <= 0) System.out.println("ddong game");
        else System.out.println(answer);
    }

    public static int calc(int result, char c, int num){
        if(c == '+'){
            result += num;
        }else if(c == '-'){
            result -= num;
        }else if(c == '*'){
            result *= num;
        }else{
            result /= num;
        }
        return result;
    }
}
