package OneOnestart;

import java.util.*;

public class code_20211231 {
	
	public static void main(String[] args) {
		int[] a = {-5,0,2,1,2};
		int[][] edges = {{0,1},{3,4},{2,3},{0,3}};
		System.out.println(solution(a,edges));
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
	
	public static long solution(int[] a, int[][] edges) {
        long answer = 0;
        long sum = Arrays.stream(a).sum();
        if(sum != 0) return -1;
        
        int[] num = new int[a.length];
        int maxIdx = 0;
        int maxVal = 0;
        N = a.length;
        INF = Integer.MAX_VALUE;
        dist = new int[a.length];
        list = new ArrayList[a.length];
       
        for(int i=0; i<edges.length; i++) {
        	num[edges[i][0]]++;
        	num[edges[i][1]]++;
        }
        
        for(int i=0; i<a.length; i++) {
        	if(maxVal < num[i]) {
        		maxVal = num[i];
        		maxIdx = i;
        	}
        }
        
        Arrays.fill(dist, INF);
		
		for(int i=0; i<N; i++) {
			list[i] = new ArrayList<Node>();
		}
		
		for(int i=0; i<edges.length; i++) {
			list[edges[i][0]].add(new Node(edges[i][1],1));
			list[edges[i][1]].add(new Node(edges[i][0],1));
		}
		
		dijkstra(maxIdx);
		
		for(int i=0; i<a.length; i++) {
			if(i == maxIdx) continue;
			answer += dist[i]*Math.abs(a[i]);
		}
        
        return answer;
    }
	
	private static void dijkstra(int start) {
		boolean[] visited = new boolean[N];
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
