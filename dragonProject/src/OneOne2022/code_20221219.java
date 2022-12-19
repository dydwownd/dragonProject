package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221219 {
//14908

/**
4
3 4
1 1000
2 2
5 5
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][4];
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            double num1 = arr[i][0];
            double num2 = arr[i][1];
            double temp = num1/num2*1000.0;
            arr[i][2] = (int)temp;
            arr[i][3] = i+1;
        }

        Arrays.sort(arr,(o1, o2) -> o1[2]-o2[2]);

        for(int i=0; i<n; i++) sb.append(arr[i][3]+" ");

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
