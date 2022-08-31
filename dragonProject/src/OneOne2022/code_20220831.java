package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20220831 {
//1052

/**
1000000 5
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long answer = 0;

        while(true){
            char[] arr = Integer.toBinaryString(n).toCharArray();
            int cnt = 0;

            for(int i=0; i<arr.length; i++) if(arr[i] == '1') cnt++;

            if(cnt <= k) break;

            n++;
            answer++;
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
