package OneOne2022;
import java.io.*;

public class code_20221007 {
//2872

/**
4
1
3
4
2
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int answer = 0;

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=n-1; i>=0; i--){
            if(arr[i] == n) n--;
            else answer++;
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
