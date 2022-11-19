package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221119 {
//25496

/**
195 4
20 1 8 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int t = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int answer = 0;

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            if(t < 200){
                answer++;
                t += arr[i];
            }

            if(t>200) break;
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
