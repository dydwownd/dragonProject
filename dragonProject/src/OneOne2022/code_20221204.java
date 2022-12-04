package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221204 {
//15889

/**
5
0 5 10 15 100
10 5 6 100
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        int length = 0;
        int max_length = 0;
        int answer = 1;
        boolean checked = false;

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < n - 1; i++) {
            length = Integer.parseInt(st.nextToken());
            if (arr[i] + length > max_length) max_length = arr[i] + length;
            if (max_length < arr[i+1]) answer = 0;
        }

        if(n==1 || answer==1) checked = true;

        bw.write(checked?"as":"sd" + "\n");
        bw.close();
        br.close();
    }
}
