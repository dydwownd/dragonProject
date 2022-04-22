package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220422 {

/**
2
-1800 -2200
1900 1700
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int answer = 0;
        PriorityQueue<Integer> bigManList = new PriorityQueue<>();
        PriorityQueue<Integer> smallManList = new PriorityQueue<>();
        PriorityQueue<Integer> bigMGirlList = new PriorityQueue<>();
        PriorityQueue<Integer> smallGirlList = new PriorityQueue<>();

        for(int i=0; i<n; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(temp > 0) bigManList.add(temp);
            else smallManList.add(Math.abs(temp));
        }

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(temp > 0) bigMGirlList.add(temp);
            else smallGirlList.add(Math.abs(temp));
        }

        while(!bigManList.isEmpty()){
            if(!smallGirlList.isEmpty()){
                if(bigManList.peek() < smallGirlList.peek()){
                    answer++;
                    bigManList.poll();
                    smallGirlList.poll();
                }else{
                    bigManList.poll();
                }
            }
        }

        while(!smallManList.isEmpty()){
            if(!bigMGirlList.isEmpty()){
                if(smallManList.peek() > bigMGirlList.peek()){
                    answer++;
                    smallManList.poll();
                    bigMGirlList.poll();
                }else{
                    smallManList.poll();
                }
            }
        }

        System.out.println(answer);

    }
}
