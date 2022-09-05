package OneOne2022;
import java.io.*;

public class code_20220905 {
//2138

/**
3
000
010
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String strOrigin = br.readLine();
        String strExpect = br.readLine();
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        int[] expect = new int[n];

        for(int i=0; i<n; i++){
            int temp = Integer.parseInt(strOrigin.substring(i,i+1));
            dp1[i] = temp;
            dp2[i] = temp;
            expect[i] = Integer.parseInt(strExpect.substring(i,i+1));
        }
        int answer1 = 1;
        int answer2 = 0;

        dp1[0] = 1-dp1[0];
        dp1[1] = 1-dp1[1];

        for(int i=1; i<n; i++){
            if(dp1[i-1] != expect[i-1]){
                dp1[i-1] = 1-dp1[i-1];
                dp1[i] = 1-dp1[i];
                answer1++;
                if(i != n-1) dp1[i+1] = 1-dp1[i+1];
            }

            if(dp2[i-1] != expect[i-1]){
                dp2[i-1] = 1-dp2[i-1];
                dp2[i] = 1-dp2[i];
                answer2++;
                if(i != n-1) dp2[i+1] = 1-dp2[i+1];
            }
        }

        if(dp1[n-1] != expect[n-1]) answer1 = Integer.MAX_VALUE;
        if(dp2[n-1] != expect[n-1]) answer2 = Integer.MAX_VALUE;

        if(answer1 == Integer.MAX_VALUE && answer2 == Integer.MAX_VALUE) answer1 = -1;

        bw.write(Math.min(answer1,answer2) + "\n");
        bw.close();
        br.close();
    }
}
