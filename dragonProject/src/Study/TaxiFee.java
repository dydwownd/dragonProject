package Study;

public class TaxiFee {
	
	public static void main(String[] args) {
		int n = 6;
		int s = 4;
		int a = 6;
		int b = 2;
		int[][] fares = {{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66}, {2, 3, 22}, {1, 6, 25}};
		
		int answer = solution(n,s,a,b,fares);
		
		System.out.println(answer);
	}
	
	static int[][] graph;
	static final int MAX_NUM = 999999;

	public static int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = MAX_NUM;
        graph = new int[n+1][n+1];
        
        for(int i=1; i<=n; i++) {
    		for(int j=1; j<=n; j++) {
    			if(i==j) {
    				graph[i][j] = 0;
    			}else {
    				graph[i][j] = MAX_NUM;
    			}
    		}
    	}
        
        for(int i=0; i<fares.length; i++) {
        	graph[fares[i][0]][fares[i][1]] = fares[i][2];
        	graph[fares[i][1]][fares[i][0]] = fares[i][2];
        }
        
        for(int k=1; k<=n; k++) {
        	for(int i=1; i<=n; i++) {
        		for(int j=1; j<=n; j++) {
        			if(graph[i][j] > graph[i][k] + graph[k][j]) {
        				graph[i][j] = graph[i][k] + graph[k][j];
        			}
        		}
        	}
        }
        
        for(int i=1; i<=n; i++) {
        	answer = Math.min(answer, graph[s][i]+graph[i][a]+graph[i][b]);
        }
        
        return answer;
    }
	
}
