package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220403 {

/**
5 3 2 10
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int now = 0;
        int answer = 0;

        for(int i=0; i<24; i++){

            if(now+A > M){
                now -= C;
                if(now < 0) now = 0;
            }else{
                now += A;
                answer += B;
            }

        }

        System.out.println(answer);

    }

}
