package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class code_20220811 {
//1783
/**
100 50
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int answer = 0;

        if(n==1) answer = 1;
        else if(n==2) answer = Math.min(4,(m+1)/2);
        else{
            if(m<7) answer = Math.min(4,m);
            else answer = m-2;
        }

        System.out.println(answer);
    }
}
