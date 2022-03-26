package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20220326 {

/**
1
20 5
3 4
2 5
1 8
3 3
2 5
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int[] answer = new int[T];

        for(int i=0; i<T; i++){
            q = new PriorityQueue<>(Collections.reverseOrder());
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int candyCnt = Integer.parseInt(st.nextToken());
            int boxCnt = Integer.parseInt(st.nextToken());

            for(int j=0; j<boxCnt; j++){
                StringTokenizer tempSt = new StringTokenizer(br.readLine()," ");
                int r = Integer.parseInt(tempSt.nextToken());
                int c = Integer.parseInt(tempSt.nextToken());
                q.offer(r*c);
            }

            while(!q.isEmpty()){
                if(candyCnt > 0){
                    candyCnt -= q.poll();
                    answer[i]++;
                }else{
                    break;
                }
            }
        }

        Arrays.stream(answer).forEach(System.out::println);

    }

}
