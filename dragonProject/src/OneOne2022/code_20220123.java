package OneOne2022;
import java.util.*;
public class code_20220123 {

    public static void main(String[] args) {
        int[][] board = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[] aloc = {1,0};
        int[] bloc = {1,2};
        System.out.println(solution(board,aloc,bloc));
    }

    static int[][] Board;
    static int answer;
    static int n;
    static int m;
    static boolean[][] visited;

    public static class Node{
        int row;
        int col;
        Node(int r, int c){
            row = r;
            col = c;
        }
    }

    public static int solution(int[][] board, int[] aloc, int[] bloc) {
        answer = 0;
        Board = board;
        n = board.length;
        m = board[0].length;
        visited = new boolean[n][m];

        solve(aloc[0],aloc[1],bloc[0],bloc[1]);

        return answer;
    }

    private static void solve(int a_row, int a_col, int b_row, int b_col) {

        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(a_row,a_col));
        q.offer(new Node(b_row,b_col));

        while(!q.isEmpty()){

        }

    }

}
