package algorithm;

//최소비용

public class Dijkstra {

	static int[][] graph = new int[200][200];
	static final int MAX_VALUE = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		
		int[][] fares = {{1,2,3},{1,5,4},{1,4,4},{2,3,2},{3,4,1},{4,5,2},{5,6,4},{4,7,6},{7,6,3},{3,8,3},{6,8,2}};
		
		int n = 8;//마을수
		
		for(int i=0; i<=n; i++){
			for(int j=0; j<=n; j++){
				graph[i][j] = MAX_VALUE;
			}
		}
		
		for(int i=0; i<fares.length; i++){
			graph[fares[i][0]][fares[i][1]] = fares[i][2];
			graph[fares[i][1]][fares[i][0]] = fares[i][2];
		}
		
		for(int i=1; i<=8; i++){
			solution(n,i);
		}
		
		System.out.println(graph[1][7]);
		
	}
	
	public static void solution(int n, int num){
		boolean[] visited = new boolean[n+1];
		int[] dist = new int[n+1];
		
		visited[num] = true;
		
		for(int i=1; i<=n; i++){
			if(!visited[i] && graph[num][i] != MAX_VALUE){
				dist[i] = graph[num][i];
			}else {
				dist[i] = MAX_VALUE;
			}
		}
		
		int min = MAX_VALUE;
		int idx = -1;
		
		for(int k=0; k<n-1; k++){
			min = MAX_VALUE;
			idx = -1;
			
			for(int i=1; i<=n; i++) {
				if(!visited[i] && dist[i] != MAX_VALUE){
					if(min > dist[i]){
						min = dist[i];
						idx = i;
					}
				}
			}
			
			visited[idx] = true;
			
			for(int i=1; i<=n; i++) {
				if(!visited[i] && graph[idx][i] != MAX_VALUE){
					if(dist[i] > dist[idx] + graph[idx][i]){
						dist[i] = dist[idx] + graph[idx][i];
					}
				}
			}
			
			for(int i=1; i<=n; i++){
				graph[num][i] = dist[i];
			}
			
		}
		
	}
	
}
