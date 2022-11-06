package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221106 {
//15748

/**
10 2 4 3
7 2
8 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int L = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int F = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];
        long answer = 0;
        long now = 0;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(o1, o2) -> o2[0]-o1[0]);

        for(int i=0; i<N; i++){
            if(now < arr[i][1]){
                answer += ((F-B) * (arr[i][1]-now) * arr[i][0]);
                now = arr[i][1];
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
