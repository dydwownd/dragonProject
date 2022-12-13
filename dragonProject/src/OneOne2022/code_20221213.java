package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221213 {
//23559

/**
3 9000
40 10
20 5
30 20
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][2];
        int sum = 0;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

            sum += arr[i][1];
        }

        Arrays.sort(arr,(o1, o2) -> o2[0]-o1[0]);

        //Arrays.sort(arr,(o1, o2) -> o1[0]<=o1[1]?1:0);

        int cnt = (x - 1000 * n) / 4000;

        for(int i=0; arr[i][0]>arr[i][1] && cnt>0; i++) {
            sum -= arr[i][1];
            sum += arr[i][0];
            cnt--;
        }

        bw.write(sum + "\n");
        bw.close();
        br.close();
    }
}
