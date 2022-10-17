package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221017 {
//1263

/**
4
3 5
8 14
5 20
1 16
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        int answer = 0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(o1,o2)-> o2[1]-o1[1]);

        answer = arr[0][1]-arr[0][0];

        for(int i=1; i<n; i++){
            if(answer > arr[i][1]){
                answer = arr[i][1];
            }

            answer -= arr[i][0];
        }

        bw.write(answer<0?"-1":answer + "\n");
        bw.close();
        br.close();
    }
}
