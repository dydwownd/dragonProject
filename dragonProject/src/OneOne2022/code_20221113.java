package OneOne2022;
import java.io.*;

public class code_20221113 {
//25176

/**
4
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long answer = 0;

        for(int i=1; i<=n; i++){
            answer *= i;
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
