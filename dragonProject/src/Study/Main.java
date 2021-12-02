package Study;

import java.util.*;

public class Main {
	
	public static class Node{
		int row;
		int col;
		int dist;
		int wallCnt;
		public Node(int r, int c, int d, int w) {
			row = r;
			col = c;
			dist = d;
			wallCnt = w;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//앱 개수, 최대 100개
		int m = sc.nextInt();//필요 메모리
		int[][] graph = new int[n][m];
		int[][] visited = new int[n][m];
		LinkedList<Node> q = new LinkedList<Node>();
		int answer = Integer.MAX_VALUE;
		int[][] p = {{1,0},{-1,0},{0,1},{0,-1}};
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				int a = sc.nextInt();
				graph[i][j] = a;
				visited[i][j] = Integer.MAX_VALUE;
			}
		}
		
		q.offer(new Node(0,0,1,0));
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			
			if(node.row == n-1 && node.col == m-1) {
				answer = node.dist;
				break;
			}
			
			for(int i=0; i<4; i++) {
				int nr = node.row + p[i][0];
				int nc = node.col + p[i][1];
				
				if(nr > n-1 || nc > m-1 || nr < 0 || nc < 0) {
					continue;
				}
				
				if(visited[nr][nc] <= node.wallCnt) {
					continue;
				}
				
				if(graph[nc][nr] == 1) {
					if(node.wallCnt == 0) {
						visited[nr][nc] = node.wallCnt+1;
						q.offer(new Node(nr,nc,node.dist+1,node.wallCnt+1));
					}
				}else {
					visited[nr][nc] = node.wallCnt;
					q.offer(new Node(nr,nc,node.dist+1,node.wallCnt));
				}
				
				
			}
			
		}
				
		System.out.println(answer == Integer.MAX_VALUE ? -1 : answer);
		
	}
}

//StringBuilder str = new StringBuilder();
//List<Integer> list = new ArrayList<Integer>();
//int b = sc.nextInt();
//int c = sc.nextInt();