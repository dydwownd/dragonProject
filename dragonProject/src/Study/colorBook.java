package Study;

import java.util.*;

public class colorBook {

	public static void main(String[] args) {
		int[][] picture = {{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0}, 
							{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0}, 
							{0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}, 
							{0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, 
							{0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0}, 
							{0, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 0}, 
							{0, 1, 1, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1, 1, 1, 0}, 
							{0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, 
							{0, 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 0}, 
							{0, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 0}, 
							{0, 0, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 0, 0}, 
							{0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, 
							{0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}};
		
		int[] answer = solution(13,16,picture);
		
		for(int i=0; i<answer.length; i++ ) {
			System.out.println(answer[i]);
		}
	}
	
	    static boolean[][] visited = {};
	    static int[][] Picture = {};
	    static List<HashMap<Integer,Integer>> list = new ArrayList<HashMap<Integer,Integer>>();
	    static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	    
	    public static int[] solution(int m, int n, int[][] picture) {
	        int numberOfArea = 0;
	        int maxSizeOfOneArea = 0;
	        
	        Picture = picture;
	        visited = new boolean[m][n];
	        
	        for(int i=0; i<m; i++){
	            for(int j=0; j<n; j++){
                    map = new HashMap<Integer,Integer>();
	                if(Picture[i][j] != 0 && !visited[i][j]){
	                    dfs(i,j,m,n,Picture[i][j]);
	                    list.add(map);
	                }
	            }
	        }
	        
	        for(Map<Integer,Integer> map : list){
	            numberOfArea++;
	            for(int i : map.keySet()){
	                if(maxSizeOfOneArea < map.get(i)) {
	                    maxSizeOfOneArea = map.get(i);
	                }
	            }
	        }
	        
	        int[] answer = new int[2];
	        answer[0] = numberOfArea;
	        answer[1] = maxSizeOfOneArea;
	        return answer;
	    }
	    
	    public static void dfs(int r, int c, int m, int n, int target){
	        if(r >= m || r < 0 || c >= n || c < 0){
	            return;
	        }
	        if(visited[r][c] || Picture[r][c] == 0){
	            return;
	        }
	        if(Picture[r][c] == target) {
	        	map.put(Picture[r][c],map.getOrDefault(Picture[r][c],0)+1);
	        	visited[r][c] = true;
	        	dfs(r+1,c,m,n,target);
	        	dfs(r-1,c,m,n,target);
	        	dfs(r,c+1,m,n,target);
	        	dfs(r,c-1,m,n,target);
	        }
	    }
	
}
