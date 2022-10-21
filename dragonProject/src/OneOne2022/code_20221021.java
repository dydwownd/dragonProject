package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221021 {
//17509

/**
20 1
20 0
20 3
10 0
10 0
10 0
30 0
30 0
30 0
20 0
20 10
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[11][2];
        for(int i=0; i<11; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(o1, o2) -> o1[0]-o2[0]);

        int answer = 0;
        int penalty = 0;
        int before = 0;

        for(int i=0; i<11; i++){
            penalty += arr[i][1];
            before += arr[i][0];
            answer += before;
        }

        answer += (20*penalty);

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
