package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220814 {
//3109
/**
5 5
.xx..
..x..
.....
...x.
...x.
*/

    static int n;
    static int m;
    static char[][] map;
    static int[] dr = {-1,0,1};
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new char[n][m];
        answer = 0;

        for(int i=0; i<n; i++){
            String str = br.readLine();
            map[i] = str.toCharArray();
        }

        for(int i=0; i<n; i++) {
            if(map[i][0] != 'x' && result(i,0)) answer++;
        }

        System.out.println(answer);
    }

    private static boolean result(int r, int c) {

        if(c == m-1){
            return true;
        }

        for(int i=0; i<3; i++){
            int nr = r+dr[i];
            int nc = c+1;

            if(nr<0 || nc<0 || nr>n-1 || nc >m-1) continue;
            if(map[nr][nc] == 'x') continue;
            map[nr][nc] = 'x';
            if(result(nr,nc)) return true;
        }

        return false;
    }
}
