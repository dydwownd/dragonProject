package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220602 {

/**
2
7 1
8589934591 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            long answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());

            while(n>0){
                answer++;
                if(n%2 != 0 && m>0){
                    n++;
                    m--;
                }
                n/=2;
            }

            System.out.print(answer);
        }


    }
}
