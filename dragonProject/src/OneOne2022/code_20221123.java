package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221123 {
//17828

/**
6 64
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        if(n*26 < x || n > x){
            bw.write("!" + "\n");
        }else{
            x -= n;

            int cnt = 0;
            while(x >= 25){
                cnt++;
                sb.append("Z");
                x -= 25;
            }

            if(x>0){
                cnt++;
                sb.append((char)('A'+x));
            }

            for(int i=cnt; i<n; i++) sb.append("A");

            sb.reverse();
            bw.write(sb.toString() + "\n");
        }

        bw.close();
        br.close();
    }
}
