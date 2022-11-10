package OneOne2022;
import java.io.*;

public class code_20221110 {
//2140

/**
5
11100
2###1
3###1
2###1
12210
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[][] map = new char[n][n];
        int[] dr = {-1,-1,-1,0,0,1,1,1};
        int[] dc = {-1,0,1,-1,1,-1,0,1};
        int answer = 0;

        for(int i=0; i<n; i++) map[i] = br.readLine().toCharArray();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(Character.isDigit(map[i][j])){
                    int cur = map[i][j]-'0';
                    for(int k=0; k<8; k++){
                        int nr = i+dr[k];
                        int nc = j+dc[k];
                        if(nc > n-1 || nc < 0 || nr > n-1 || nr < 0) continue;
                        if(map[nr][nc] == '#' && cur != 0) {
                            cur--;
                            map[nr][nc] = '*';
                        }else if(map[nr][nc] == '*' && cur != 0) {
                            cur--;
                        }else if(map[nr][nc] == '#' && cur == 0) {
                            map[nr][nc] = '-';
                        }
                    }
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j] == '*' || map[i][j] == '#')  answer++;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
