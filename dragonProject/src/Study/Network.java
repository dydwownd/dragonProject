package Study;

public class Network {

	public static void main(String[] args) {
		int n = 5;
		int[][] computers = {{1, 0, 0, 0, 0}, 
							 {0, 1, 0, 0, 1}, 
							 {0, 0, 1, 0, 1}, 
							 {0, 0, 0, 1, 1}, 
							 {1, 0, 0, 0, 1}};
		int answer = solution(n,computers);
		
		System.out.println(answer);
	}
	
	public static int solution(int n, int[][] computers) {
		int answer = 0;
		
		boolean[] visited = new boolean[n];
		
		for(int i=0; i<n; i++) {
			if(!visited[i]) {
				answer++;
				dfs(i,computers,visited);
			}
		}
		return answer;
    }

	private static void dfs(int i, int[][] computers, boolean[] visited) {
		visited[i] = true;
		for(int j=0; j<computers.length; j++) {
			if(!visited[j] && computers[i][j] == 1) {
				dfs(j,computers,visited);
			}
		}
	}
	
	
}
