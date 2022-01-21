package OneOne2022;
import java.util.*;

public class code_20220121 {

    public static void main(String[] args) {

        int[] info = {0,0,1,1,1,0,1,0,1,0,1,1};
        int[][] edges = {{0,1},{1,2},{1,4},{0,8},{8,7},{9,10},{9,11},{4,3},{6,5},{4,6},{8,9}};
        System.out.println(solution(info,edges));
    }

    static int[][] map;
    static int[] Info;
    static int N;

    public static class Node{
        int idx;
        int lamCnt;
        int wolfCnt;
        boolean[] visited;
        Node(int i, int l, int w){
            idx = i;
            lamCnt = l;
            wolfCnt = w;
        }
    }

    public static int solution(int[] info, int[][] edges) {

        N = info.length;
        Info = info;
        map = new int[N][N];

        for(int i=0; i<edges.length; i++){
            map[edges[i][0]][edges[i][1]] = 1;
            map[edges[i][1]][edges[i][0]] = 1;
        }

        int answer = result();

        return answer;
    }

    public static int result(){
        int result = 0;
        Info[0] = -1;
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(0,1,0));

        while(!q.isEmpty()){
            Node now = q.poll();

            if(now.lamCnt > result) result = now.lamCnt;

            for(int i=0; i<N; i++){
                if(!now.visited[i] && map[now.idx][i] == 1){
                    if(now.lamCnt <= Info[i]+now.wolfCnt) continue;
                    if(Info[i] == 0){
                        Node next = new Node(i,now.lamCnt+1,now.wolfCnt);
                        q.offer(next);
                        Info[i] = -1;
                    }
                    now.visited[i] = true;
                    q.offer(new Node(i,now.lamCnt,(Info[i] == 1) ? now.wolfCnt+1 : now.wolfCnt));
                }
            }
        }

        return result;
    }

}
