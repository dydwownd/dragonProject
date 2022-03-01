package OneOne2022;
import java.util.*;
import java.io.*;

public class code_20220301 {

/**
3
1 7 3 5 9 2
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        N *= 2;
        int[] skill = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int idx = 0;
        int answer = Integer.MAX_VALUE;

        while(st.hasMoreTokens()){
            skill[idx++] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(skill);

        for(int i=0; i<N/2; i++){
            answer = Math.min(answer,skill[i]+skill[N-i-1]);
        }

        System.out.println(answer);
    }

}
