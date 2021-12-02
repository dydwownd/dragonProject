package algorithm;

import java.util.*;

public class NewDijkstra {

	public static void main(String[] args) {

		int[][] fares = {{1,2,3},{1,5,4},{1,4,4},{2,3,2},{3,4,1},{4,5,2},{5,6,4},{4,7,6},{7,6,3},{3,8,3},{6,8,2}};
		
		int n = 8;//¸¶À»¼ö
		
		solution(fares,n);
	}

	public static class Node implements Comparable<Node>{
		int end;
		int fee;
		public Node(int e, int f) {
			end = e;
			fee = f;
		}
		
		public int compareTo(Node o) {
			return this.fee-o.fee;
		}
	}
	
	static int INF;
	static int[] dist;
	static int N;
	static List<Node>[] list;
	
	private static void solution(int[][] fares, int n) {
		INF = 987654321;
		dist = new int[n+1];
		list = new List[n+1];
		N = n;
		
		Arrays.fill(dist, INF);
		
		for(int i=1; i<=n; i++) {
			list[i] = new ArrayList<Node>();
		}
		
		for(int i=0; i<fares.length; i++) {
			list[fares[i][0]].add(new Node(fares[i][1],fares[i][2]));
		}
		
		dijkstra(1);
		
		for(int i=1; i<=n; i++) {
			System.out.println(dist[i]);
		}
	}

	private static void dijkstra(int start) {
		boolean[] visited = new boolean[N+1];
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		
		q.offer(new Node(start,0));
		dist[start] = 0;
		
		while(!q.isEmpty()) {
			Node curNode = q.poll();
			int curEnd = curNode.end;
			
			if(visited[curEnd]) continue;
			
			visited[curEnd] = true;
			
			for(Node node : list[curEnd]) {
				if(dist[node.end] > dist[curEnd] + node.fee) {
					dist[node.end] = dist[curEnd] + node.fee;
					q.offer(new Node(node.end,dist[node.end]));
				}
			}
		}
		
	}
	
}
