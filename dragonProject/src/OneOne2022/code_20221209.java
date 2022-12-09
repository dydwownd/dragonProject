package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20221209 {
//12034

/**
2
3
15 20 60 75 80 100
4
9 9 12 12 12 15 16 20
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=t; i++){
            int n = Integer.parseInt(br.readLine())*2;
            int[] arr = new int[n];
            PriorityQueue<Integer> q = new PriorityQueue<>();
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            sb.append("Case #");
            sb.append(i);
            sb.append(": ");

            for(int j=0; j<n; j++) arr[j] = Integer.parseInt(st.nextToken());

            Arrays.sort(arr);

            for(int j=0; j<n; j++){
                if(!q.isEmpty() && q.peek() == arr[j]){
                    q.poll();
                }else{
                    sb.append(arr[j]);
                    sb.append(" ");
                    q.offer(arr[j]/3*4);
                }
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
