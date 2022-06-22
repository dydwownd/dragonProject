package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220622 {

/**
5
7 6 8 6 9
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int max = 3;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(st.nextToken());
            max = Math.max(max,temp);
        }

        System.out.println(max-(N-2));
    }
}
