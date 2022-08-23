package OneOne2022;
import java.io.*;
import java.util.*;

public class code_20220823 {
//11497
/**
3
7
13 10 12 11 10 11 12
5
2 4 5 7 9
8
6 6 6 6 6 6 6 6
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int testcase=0; testcase<t; testcase++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int[] arr = new int[n];
            int[] result = new int[n];
            int answer = 0;
            int idx = 0;
            Queue<Integer> q = new LinkedList<>();
            Stack<Integer> stack = new Stack<>();
            boolean checked = true;

            for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);

            for(int i=n-1; i>=0; i--){
                if(checked){
                    q.offer(arr[i]);
                    checked = false;
                }else{
                    stack.push(arr[i]);
                    checked = true;
                }
            }

            while(!q.isEmpty()) result[idx++] = q.poll();
            while(!stack.isEmpty()) result[idx++] = stack.pop();

            for(int i=0; i<n-1; i++) answer = Math.max(answer,Math.abs(result[i]-result[i+1]));

            answer = Math.max(answer,Math.abs(result[0]-result[n-1]));

            sb.append(answer);
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
