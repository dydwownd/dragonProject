package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221028 {
//20207

/**
7
2 4
4 5
5 6
5 7
7 9
11 12
12 12
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] map = new int[370];
        int answer = 0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for(int j=start; j<=end; j++) map[j]++;
        }

        int x = 0;
        int y = 0;

        for(int i=1; i<370; i++){
            if(map[i] > 0) x++;
            else continue;
            y = Math.max(y,map[i]);
            if(map[i+1] == 0){
                answer += (x*y);
                x = 0;
                y = 0;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
