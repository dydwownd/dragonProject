package OneOne2022;
import java.io.*;

public class code_20220921 {
//1285

/**
3
HHT
THH
THT
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[][] map = new char[n][n];
        int answer = n*n;

        for(int i=0; i<n; i++) map[i] = br.readLine().toCharArray();

        for(int bit=0; bit<(1<<n); bit++){
            int sum = 0;
            for(int i=0; i<n; i++){
                int cnt = 0;
                for(int j=0; j<n; j++){
                    if((bit & (1<<j)) != 0){
                        if(map[j][i] == 'T') map[j][i] = 'H';
                        else map[j][i] = 'T';
                    }
                    if(map[j][i] == 'T') cnt++;
                }
                sum += Math.min(cnt, n-cnt);
            }
            answer = Math.min(answer,sum);
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
