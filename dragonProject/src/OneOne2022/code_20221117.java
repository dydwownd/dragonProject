package OneOne2022;
import java.io.*;

public class code_20221117 {
//2220

/**
6
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[n+1];

        for (int i=1; i<n; i++) {
            for (int j=i; j>1; j/=2) {
                arr[j] = arr[j/2];
            }

            arr[1] = i+1;
        }

        arr[n] = 1;
        for (int i=1; i<=n; i++) {
            sb.append(arr[i] + " ");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
