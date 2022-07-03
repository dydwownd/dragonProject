package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.*;

public class code_20220703 {
//24229
/**
5
2 9
0 2
11 15
16 17
19 20
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] map = new int[200000];
        int answer = 0;

        StringTokenizer st;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for(int j=start; j<=end; j++){
                map[j]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        q.offer(0);

        while(!q.isEmpty()){
            int now = q.poll();
            int sum = 0;

            for(int i=now+1; i<200000; i++){
                if(map[i]>0) sum++;
                else break;
            }
            answer = Math.max(answer,now+sum);

            for(int i=now+sum+1; i<=now+sum+sum; i++){
                int temp = 0;
                if(map[i]>0){
                    q.offer(i);
                    for(int j=i+1; j<=now+sum+sum; j++){
                        if(map[j]>0) temp++;
                        else break;
                    }
                    i+=temp;
                }
            }
        }

        System.out.println(answer);
    }
}
