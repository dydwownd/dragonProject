package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221114 {
//20921

/**
4 2
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) arr[i] = i+1;

        for (int i=1; i<n; i++) {
            for (int j=n-1; j>i-1; j--) {
                if (answer >= k) break;

                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                answer++;
            }
            if (answer >= k) break;
        }

        for(int i=0; i<n; i++) sb.append(arr[i] + " ");

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
