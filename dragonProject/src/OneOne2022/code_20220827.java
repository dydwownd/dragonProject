package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20220827 {
//11501

/**
3
3
10 7 6
3
3 5 9
5
1 1 3 1 2
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int tc=0; tc<t; tc++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int[] arr = new int[n];
            long answer = 0;
            int max = 0;

            for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

            for(int i=n-1; i>=0; i--){
                if(arr[i] > max) {
                    max = arr[i];
                }else if(arr[i] < max){
                    answer += max-arr[i];
                }
            }

            sb.append(answer);
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

}
