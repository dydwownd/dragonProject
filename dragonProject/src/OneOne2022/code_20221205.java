package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221205 {
//2285

/**
3
1 3
2 5
3 3
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        StringTokenizer st;
        int answer = 0;
        long sum = 0;
        long now = 0;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            sum += arr[i][1];
        }

        Arrays.sort(arr,(o1, o2) -> o1[0]-o2[0]);

        for(int i=0; i<n; i++){
            now += arr[i][1];
            if(now >= (sum+1)/2){
                answer = arr[i][0];
                break;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
