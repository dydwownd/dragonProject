package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221222 {
//20117

/**
4
4 2 8 9
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        Arrays.sort(arr);
        if (n%2 == 0) {
            for (int i=n-1; i>=n/2; i--) {
                sum += arr[i] * 2;
            }
        } else {
            int temp;
            for (temp=n-1; temp>n/2; temp--) {
                sum += arr[temp] * 2;
            }
            sum += arr[temp];
        }

        bw.write(sum + "\n");
        bw.close();
        br.close();
    }
}
