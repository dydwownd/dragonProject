package OneOne2022;
import java.io.*;

public class code_20220920 {
//17615

/**
9
RBBBRBRRR
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int cntR = 0;
        int cntB = 0;
        int answer = n;
        int cnt = 0;

        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'R') cntR++;
            else cntB++;
        }

        for(int i=0; i<n; i++) {
            if (str.charAt(i) == 'R') cnt++;
            else break;
        }
        answer = Math.min(answer,cntR-cnt);

        cnt = 0;
        for(int i=n-1; i>=0; i--) {
            if (str.charAt(i) == 'R') cnt++;
            else break;
        }
        answer = Math.min(answer,cntR-cnt);

        cnt = 0;
        for(int i=0; i<n; i++) {
            if (str.charAt(i) == 'B') cnt++;
            else break;
        }
        answer = Math.min(answer,cntB-cnt);

        cnt = 0;
        for(int i=n-1; i>=0; i--) {
            if (str.charAt(i) == 'B') cnt++;
            else break;
        }
        answer = Math.min(answer,cntB-cnt);

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
