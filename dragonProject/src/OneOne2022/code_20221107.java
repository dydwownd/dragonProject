package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221107 {
//7983

/**
3
2 8
1 13
3 10
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][4];
        int answer = 0;
        int now = 0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(o1, o2) -> o2[1]-o1[1]);

        arr[0][3] = arr[0][1];
        arr[0][2] = arr[0][3] - (arr[0][0]-1);

        for(int i=1; i<n; i++){
            arr[i][3] = arr[i][1];
            arr[i][2] = arr[i][3] - (arr[i][0]-1);

            if(arr[i][3] >= arr[i-1][2]){
                arr[i][3] = arr[i-1][2]-1;
                arr[i][2] = arr[i][3] - (arr[i][0]-1);
            }
        }

        bw.write(arr[n-1][2]-1 + "\n");
        bw.close();
        br.close();
    }
}
