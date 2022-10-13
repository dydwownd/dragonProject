package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221013 {
//1817

/**
6 10
5 5 5 5 5 5
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int answer = 0;
        if(n>0){
            st = new StringTokenizer(br.readLine()," ");
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            answer++;
            int temp = m;

            for(int i=0; i<n; i++){
                if(arr[i] > temp){
                    answer++;
                    temp = m;
                }
                temp -= arr[i];
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
