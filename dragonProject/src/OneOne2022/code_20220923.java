package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20220923 {
//19539

/**
1
0
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        int sum = 0;
        int odd_cnt = 0;
        boolean result = false;

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
            if(arr[i]%2 == 1) odd_cnt++;
        }

        if(sum%3 == 0 && odd_cnt <= sum/3) result = true;

        bw.write(result?"YES":"NO" + "\n");
        bw.close();
        br.close();
    }
}
