package OneOne2022;
import java.io.*;
import java.util.*;

public class code_20220906 {
//9009

/**
4
100
200
12345
1003
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] num = new int[46];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());

        num[0] = 0;
        num[1] = 1;
        for(int i=2; i<46; i++) num[i] = num[i-2]+num[i-1];

        for(int t=0; t<n; t++){
            PriorityQueue<Integer> q = new PriorityQueue<>();
            for(int i=45; i>0; i--){
                if(arr[t] >= num[i]){
                    q.offer(num[i]);
                    arr[t] -= num[i];
                }
            }
            while(!q.isEmpty()) sb.append(q.poll()+" ");

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
