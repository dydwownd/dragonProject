package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20220901 {
//19939

/**
5 3
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int answer = 0;
        int min = 0;
        for(int i=1; i<=k; i++) min += i;

        if(n < min){
            answer = -1;
        }else{
            if(n%k == 0){
                answer = k-1;
            }else{
                answer = k;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
