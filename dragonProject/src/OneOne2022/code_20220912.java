package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20220912 {
//2873

/**
3 3
5 1 3
2 4 8
1 1 2
 */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<m; j++) map[i][j] = Integer.parseInt(st.nextToken());
        }

        if(n%2 != 0){
            for(int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    if(i%2 == 0) sb.append("R");
                    else sb.append("L");
                }
                if(i != n-1) sb.append("D");
            }
        }else if(n%2 == 0 && m%2 !=0){
            for(int i=0; i<m; i++) {
                for (int j=0; j<n; j++) {
                    if(i%2 == 0) sb.append("D");
                    else sb.append("U");
                }
                if(i != m-1) sb.append("R");
            }
        }else if(n%2 == 0 && m%2 == 0){
            int minR = 0;
            int minC = 0;
            int minVal = 1001;
            for(int i=0; i<n; i++) {
                int temp = 0;
                if(i%2==0) temp = 1;
                for (int j=temp; j<m; j=j+2) {
                    if(map[i][j] < minVal){
                        minVal = map[i][j];
                        minR = i;
                        minC = j;
                    }
                }
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
