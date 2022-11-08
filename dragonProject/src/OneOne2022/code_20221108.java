package OneOne2022;
import java.io.*;

public class code_20221108 {
//21313

/**
4
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        boolean oddEvenYn = false;

        if(n%2 == 1){
            oddEvenYn = true;
            n--;
        }

        for(int i=n; i>0; i--){
            if(i%2==0) sb.append("1").append(" ");
            else sb.append("2").append(" ");
        }

        if(oddEvenYn) sb.append("3");

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
