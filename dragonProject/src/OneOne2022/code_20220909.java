package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20220909 {
//1105

/**
1 10
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String L = st.nextToken();
        String R = st.nextToken();
        int answer = 0;

        if(L.length() == R.length()){
            for(int i=0; i<L.length(); i++){
                if(L.charAt(i) != R.charAt(i)) break;
                if(L.charAt(i) == '8') answer++;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
