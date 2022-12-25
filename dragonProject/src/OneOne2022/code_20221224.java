package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221224 {
//1455

/**
2 2
00
01
*/

    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int answer = 0;

        arr = new int[n][m];

        for(int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split("");
            for(int j = 0; j < m ; j++){
                arr[i][j] = Integer.parseInt(tmp[j]);
            }
        }

        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                if(arr[j][i] == 1) {
                    reverse(j, i);

                    answer += 1;
                }

            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }

    static void reverse(int x, int y) {
        for(int i = 0; i <= x; i++) {
            for(int j = 0; j <= y; j++) {
                if(arr[i][j] == 1){
                    arr[i][j] = 0;
                }else{
                    arr[i][j] = 1;
                }
            }
        }
    }
}
