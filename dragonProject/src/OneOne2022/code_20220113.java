package OneOne2022;
public class code_20220113 {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));
    }

    static int[][] map;
    static int answer;
    static int N;
    static int[] dr = {-1,-1,1,1,-1,1};
    static int[] dc = {-1,1,-1,1,0,0};

    public static int solution(int n) {
        answer = 0;
        N = n;
        map = new int[n][n];

        dfs(0);

        return answer;
    }

    private static void dfs(int idx) {

        if(idx == N){
            answer++;
            return;
        }

        for(int i=0; i<N; i++){
            if(isPossible(idx,i)){
                map[idx][i] = 1;
                dfs(idx+1);
                map[idx][i] = 0;
            }

        }

    }

    private static boolean isPossible(int r, int c) {

        for(int i=0; i<6; i++){
            int nr = r+dr[i];
            int nc = c+dc[i];
            for(int j=0; j<N; j++){
                if(nr > N-1 || nr < 0 || nc >N-1 || nc < 0) continue;
                if(map[nr][nc] == 1) return false;
                nr += dr[i];
                nc += dc[i];
            }
        }

        return true;
    }

}
