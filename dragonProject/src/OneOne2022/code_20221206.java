package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221206 {
//25400

/**
8
6 1 2 3 2 4 5 10
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        int now = 1;
        int answer = 0;

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            if(now == arr[i]){
                now++;
            }else{
                answer++;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
