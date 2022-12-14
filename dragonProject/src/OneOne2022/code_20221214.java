package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221214 {
//25644

/**
5
4 2 3 1 5
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int answer = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            answer = Math.max(answer, arr[i] - min);
            min = Math.min(min, arr[i]);
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
