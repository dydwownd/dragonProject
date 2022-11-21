package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221121 {
//14247

/**
5
1 3 2 4 6
2 7 3 4 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        long answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++) arr[i][0] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++) arr[i][1] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr,(o1, o2) -> o1[1]==o2[1]?o1[0]-o2[0]:o1[1]-o2[1]);

        for(int i=0; i<n; i++){
            answer += (arr[i][0] + (arr[i][1]*i));
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
