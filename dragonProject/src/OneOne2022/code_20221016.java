package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221016 {
//12788

/**
7
36 3
9 70 15 13 19 20 11
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int sum = 0;
        int now = 0;
        int answer = 0;

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }

        if(m*k > sum){
            answer = -1;
        }else{
            Arrays.sort(arr);

            for(int i=n-1; i>=0; i--){
                now += arr[i];
                answer++;

                if(now >= m*k) break;
            }
        }

        bw.write(answer==-1?"STRESS":answer + "\n");
        bw.close();
        br.close();
    }
}
