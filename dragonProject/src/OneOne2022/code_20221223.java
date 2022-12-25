package OneOne2022;
import java.io.*;

public class code_20221223 {
//2777

/**
2
10
26
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int k=0; k<t; k++){
            int n = Integer.parseInt(br.readLine());;
            int answer = 0;
            if (n < 10){
                sb.append(1);
                sb.append("\n");
                continue;
            }

            for(int i=9; i>=2; i--) {
                while (n % i == 0){
                    ++answer;
                    n /= i;
                }
                if (n == 1) break;
            }

            sb.append(n==1 ? answer : -1);
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
