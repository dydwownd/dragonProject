package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221005 {
//14754

/**
4 4
1 2 4 6
16 9 13 11
5 10 8 15
12 14 7 3
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long total = 0;
        long sum = 0;

        int[][] map = new int[n][m];
        int[][] result = new int[n][m];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                total += map[i][j];
            }
        }

        int maxRIdx = 0;
        int maxCIdx = 0;
        int max = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j] > max){
                    max = map[i][j];
                    maxRIdx = i;
                    maxCIdx = j;
                }
            }

            result[maxRIdx][maxCIdx] = max;
            max = 0;
            maxRIdx = 0;
            maxCIdx = 0;
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(map[j][i] > max){
                    max = map[j][i];
                    maxRIdx = j;
                    maxCIdx = i;
                }
            }

            result[maxRIdx][maxCIdx] = max;
            max = 0;
            maxRIdx = 0;
            maxCIdx = 0;
        }

        for(int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                sum += result[i][j];
            }
        }

        total -= sum;
        bw.write(total + "\n");
        bw.close();
        br.close();
    }
}
