package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20220828 {
//14720

/**
7
0 1 2 0 1 2 0
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] order = {0,1,2};
        int[] arr = new int[n];
        int answer = 0;

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            if(arr[i] == order[answer%3]){
                answer++;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }

}
