package OneOne2022;
import java.io.*;
import java.util.*;

public class code_20220927 {
//1135

/**
24
-1 0 0 1 1 1 2 2 3 3 4 4 5 5 6 7 7 8 12 13 14 16 16 16
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int answer = 0;
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        Queue<int[]> q = new LinkedList<>();

        for(int i=0; i<n; i++){
            list.add(new ArrayList<Integer>());
        }

        for(int i=0; i<n; i++){
            if(i==0){
                int temp = Integer.parseInt(st.nextToken());
            }else{
                list.get(Integer.parseInt(st.nextToken())).add(i);
            }
        }

        q.offer(new int[]{0,0});

        while(!q.isEmpty()){
            int[] temp = q.poll();

            if(temp[1] > answer){
                answer = temp[1];
            }

            for(int i : list.get(temp[0])){
                q.offer(new int[]{i,temp[1]+1});
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
