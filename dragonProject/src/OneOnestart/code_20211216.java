package OneOnestart;

public class code_20211216 {

	public static void main(String[] args) {
		int m = 3;
		int n = 6;
		int[][] cityMap = {{0, 2, 0, 0, 0, 2}, {0, 0, 2, 0, 1, 0}, {1, 0, 0, 2, 2, 0}};
		int answer = solution(m,n,cityMap);
		System.out.println(answer);
	}
	
	static int MOD = 20170805;
	static int INF = Integer.MAX_VALUE;
	static int[][] CityMap;
	static int M;
	static int N;
    public static int solution(int m, int n, int[][] cityMap) {
        
        for(int i=0; i<m; i++) {
        	for(int j=0; j<n; j++) {
        		if(cityMap[i][j] == 1) cityMap[i][j] = -1;
        		if(cityMap[i][j] == 2) cityMap[i][j] = INF;
        	}
        }
        
        cityMap[0][0] = 1;
        
        CityMap = cityMap;
        M = m;
        N = n;
        
        for(int i=0; i<m; i++) {
        	for(int j=0; j<n; j++) {
        		if(CityMap[i][j] == -1) {
        			CityMap[i][j] = 0;
        			continue;
        		}
        		
        		if(CityMap[i][j] == INF) continue;
        		
        		if(i > 0) {
        			CityMap[i][j] += resultRow(i-1,j);
        		}
        		
        		if(j > 0) {
        			CityMap[i][j] += resultCol(i,j-1);
        		}
        	}
        }
        
        return cityMap[m-1][n-1]%MOD;
    }
    
	private static int resultCol(int i, int j) {
		
		for(int c=j; c>=0; c--) {
			if(CityMap[i][c] != INF) return CityMap[i][c];
		}
		
		return 0;
	}
	
	private static int resultRow(int i, int j) {
		
		for(int r=i; r>=0; r--) {
			if(CityMap[r][j] != INF) return CityMap[r][j];
    	}
		
		return 0;
	}
/*
{0, 2, 0, 0, 0, 2}
{0, 0, 2, 0, 1, 0}
{1, 0, 0, 2, 2, 0}


[1, 2147483647, 1, 			1, 			1, 			2147483647]
[1, 1, 			2147483647, 2, 			0, 			0]
[0, 1, 			2, 			2147483647, 2147483647, 2]
 */
}
