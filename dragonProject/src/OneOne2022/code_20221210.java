package OneOne2022;
import java.io.*;

public class code_20221210 {
//1437

/**
7
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long answer = 1;

        while(n >= 5){
            answer = (3*answer)%10007;
            n -= 3;
        }

        bw.write((answer*n)%10007 + "\n");
        bw.close();
        br.close();
    }
}
