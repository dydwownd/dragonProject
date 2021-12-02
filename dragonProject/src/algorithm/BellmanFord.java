package algorithm;

import java.util.*;

public class BellmanFord {

	public static void main(String[] args) {

		int[][] fares = {{1,2,3},{1,5,4},{1,4,4},{2,3,2},{3,4,1},{4,5,2},{5,6,4},{4,7,6},{7,6,3},{3,8,3},{6,8,2}};
		
		int n = 8;//마을수
		
		solution(fares,n);
	}

	public static class Node{
		int start;
		int end;
		int fee;
		public Node(int s, int e, int f) {
			start = s;
			end = e;
			fee = f;
		}
	}
	
	private static void solution(int[][] fares, int n) {
		List<Node> list = new ArrayList<Node>();
		int[] dist = new int[n+1];
		int INF = 987654321;
		int num = 1;
		
		Arrays.fill(dist, INF);
		
		for(int i=0; i<fares.length; i++) {
			list.add(new Node(fares[i][0],fares[i][1],fares[i][2]));
		}
		
		dist[num] = 0;
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<fares.length; j++) {
				int start = list.get(j).start;
				int end = list.get(j).end;
				int fee = list.get(j).fee;
				
				if(dist[start] == INF) continue;
				
				if(dist[end] > dist[start] + fee) {
					dist[end] = dist[start] + fee;
				}
			}
		}
		
		boolean check = false;//연결 안된마을이 있는지 체크
		
		for(int j=0; j<fares.length; j++) {
			int start = list.get(j).start;
			int end = list.get(j).end;
			int fee = list.get(j).fee;
			
			if(dist[start] != INF && dist[end] > dist[start] + fee) {
				check = true;
				break;
			}
		}
		
		for(int i=1; i<=n; i++) {
			System.out.println(dist[i]);
		}
		
	}

}
