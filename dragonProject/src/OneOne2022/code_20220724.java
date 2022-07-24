package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220724 {
//13305
/**
4
2 3 1
5 2 4 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] dist = new long[n-1];
        long[] price = new long[n];
        long min = Integer.MAX_VALUE;
        long answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n-1; i++) dist[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++) price[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<n-1; i++){
            if(min > price[i]) min = price[i];
            answer += min*dist[i];
        }

        System.out.println(answer);
    }
}
