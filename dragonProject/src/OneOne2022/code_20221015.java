package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221015 {
//12931

/**
2
2 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        int answer = 0;
        int sum = 0;

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }

        while(sum>0){
            int now = 0;
            for(int i=0; i<n; i++){
                if(arr[i]%2 == 1){
                    arr[i]--;
                    now++;
                }
            }
            if(now > 0){
                sum -= now;
                answer += now;
            }else{
                for(int i=0; i<n; i++){
                    arr[i] /= 2;
                }
                sum /= 2;
                answer++;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
