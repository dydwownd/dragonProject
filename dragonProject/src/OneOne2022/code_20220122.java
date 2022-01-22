package OneOne2022;
public class code_20220122 {

    public static void main(String[] args) {
        int[][] board = {{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5}};
        int[][] skill = {{1,0,0,3,4,4},{1,2,0,2,3,2},{2,1,0,3,1,2},{1,0,1,3,3,1}};
        System.out.println(solution(board,skill));
    }

    static int[][] Board;

    public static int solution(int[][] board, int[][] skill) {
        int answer = 0;

        Board = board;

        for(int i=0; i<skill.length; i++){
            solve(skill[i][0],skill[i][1],skill[i][2],skill[i][3],skill[i][4],skill[i][5]);
        }

        for(int i=0; i<Board.length; i++){
            for(int j=0; j<Board[0].length; j++){
                if(Board[i][j] > 0) answer++;
            }
        }

        return answer;
    }

    private static void solve(int type, int sr, int sc, int er, int ec, int amount) {

        for(int i=sr; i<=er; i++){
            for(int j=sc; j<=ec; j++){
                if(type == 1) Board[i][j] -= amount;
                else Board[i][j] += amount;
            }
        }

    }

}
