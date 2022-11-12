package OneOne2022;
import java.io.*;

public class code_20221112 {
//2057

/**
5
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long t = 2432902008176640000L;
        long n = Long.parseLong(br.readLine());

        if (n == 0) n = -1;
        else{
            for(int i=20; i>0; i--){
                t /= i;
                if(n>=t) n -= t;
            }
        }

        bw.write(n!=0? "NO": "YES" + "\n");
        bw.close();
        br.close();
    }
}
