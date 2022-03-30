package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220330 {

/**
3 4 4
0 1
2 2
5 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] apt = new int[30001];
        PriorityQueue<int[]> left = new PriorityQueue<>((o1, o2) -> o1[0]-o2[0]);
        PriorityQueue<int[]> right = new PriorityQueue<>((o1, o2) -> o2[0]-o1[0]);
        int answer = 0;
        int add = 0;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            int idx = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken());
            if(idx < s){
                left.offer(new int[]{idx,cnt});
            }else{
                right.offer(new int[]{idx,cnt});
            }
        }

        while(!left.isEmpty()){
            int[] temp = left.poll();

            if(add > 0){
                if(temp[1] > add){
                    temp[1] -= add;
                    add = 0;
                }else{
                    temp[1] = 0;
                    add = add - temp[1];
                }
            }

            if(temp[1] > 0){
                if(temp[1] > k){
                    left.offer(new int[]{temp[0],temp[1]-k});
                }else{
                    add = k-temp[1];
                }

                answer += (s-temp[0])*2;
            }
        }

        add = 0;

        while(!right.isEmpty()){
            int[] temp = right.poll();

            if(add > 0){
                if(temp[1] > add){
                    temp[1] -= add;
                    add = 0;
                }else{
                    temp[1] = 0;
                    add = add - temp[1];
                }
            }

            if(temp[1] > 0){
                if(temp[1] > k){
                    left.offer(new int[]{temp[0],temp[1]-k});
                }else{
                    add = k-temp[1];
                }

                answer += (temp[0]-s)*2;
            }
        }

        System.out.println(answer);

    }

}
