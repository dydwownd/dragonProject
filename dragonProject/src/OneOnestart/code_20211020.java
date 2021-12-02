package OneOnestart;

import java.util.*;

public class code_20211020 {

	public static void main(String[] args) {
		int n = 3;
		int[][] wires = {{1,2}};//{{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
		int answer = solution(n,wires);
		System.out.println(answer);
	}
	
	static int N;
	static int[][] Wires;
    
    public static int solution(int n, int[][] wires) {
        int answer = 100;
        N = n;
        Wires = wires;
        int[] parent = new int[n];
        
        for(int i=0; i<wires.length; i++){
        	for(int j=0; j<n; j++){
                parent[j] = j;
            }
            answer = Math.min(process(i,parent),answer);
        }
        
        return answer;
    }
    
    public static int process(int idx, int[] parent){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int max = 0;
        int min = 0;
        
        for(int i=0; i<Wires.length; i++){
            if(i == idx) continue;
            int x = find(parent, Wires[i][0]-1);
            int y = find(parent, Wires[i][1]-1);
            if(x != y){
                union(parent,x,y);
            }
        }
        
        for(int i=0; i<N; i++){
            map.put(parent[i],map.getOrDefault(parent[i],0)+1);
        }
        
        for(int i : map.keySet()){
            max = Math.max(map.get(i), max);
        }
        
        min = N-max;
        
        return max-min;
    }
    
    public static int find(int[] parent, int x){
        if(parent[x] == x) return parent[x];
        return find(parent, parent[x]);
    }
    
    public static void union(int[] parent, int x, int y){
        x = find(parent,x);
        y = find(parent,y);
        
        if(x > y){
            parent[x] = y;
        }else{
            parent[y] = x;
        }
    }
	
}
