package OneOne2022;
import java.io.*;

public class code_20220922 {
//14939

/**
#O########
OOO#######
#O########
####OO####
###O##O###
####OO####
##########
########O#
#######OOO
########O#
*/

    static char[][] map;
    static char[][] temp;
    static int[] dr = {1,-1,0,0};
    static int[] dc = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        map = new char[10][10];
        temp = new char[10][10];
        int answer = Integer.MAX_VALUE;

        for(int i=0; i<10; i++){
            map[i] = br.readLine().toCharArray();
        }

        for(int c=0; c<(1<<10); c++) {
            deepCopy(map, temp);

            int cnt = 0;
            cnt = simulation(temp, c, cnt);

            if(isAllOff(temp)) {
                answer = Math.min(answer, cnt);
            }
        }

        bw.write( answer==Integer.MAX_VALUE ? -1 : answer);
        bw.write("\n");
        bw.close();
        br.close();
    }

    private static boolean isAllOff(char[][] temp) {
        boolean flag = true;
        for(int x=0; x<10; x++) {
            if(temp[9][x] == 'O') {
                flag = false;
                break;
            }
        }
        return flag;
    }

    private static int simulation(char[][] temp, int c, int cnt) {
        for(int x=0; x<10; x++) {
            if((c & (1<<x)) != 0) {
                lightSwitch(temp, x, 0);
                cnt++;
            }
        }

        for(int y=1; y<10; y++) {
            for(int x=0; x<10; x++) {
                if(temp[y-1][x] == 'O') {
                    lightSwitch(temp, x, y);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private static void lightSwitch(char[][] temp, int x, int y) {
        map[y][x] = switchOnOff(map[y][x]);
        for(int d=0; d<4; d++) {
            int nc = x + dc[d];
            int nr = y + dr[d];

            if(nc <0 || nr <0 || nc >= 10 || nr >= 10) continue;

            map[nc][nr] = switchOnOff(map[nc][nr]);
        }
    }

    private static char switchOnOff(char c) {
        if(c == '#') return 'O';
        else return '#';
    }

    private static void deepCopy(char[][] map, char[][] temp) {
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                temp[i][j] = map[i][j];
            }
        }
    }
}
