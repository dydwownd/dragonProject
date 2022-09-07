package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220907 {
//13164

/**
5 3
1 3 5 6 10
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int[] diff = new int[n-1];
        int idx = n-1-(k-1);
        int answer = 0;

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        for(int i=0; i<n-1; i++) diff[i] = arr[i+1]-arr[i];

        Arrays.sort(diff);

        for(int i=0; i<idx; i++) answer += diff[i];

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
