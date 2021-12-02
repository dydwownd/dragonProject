package OneOnestart;

import java.util.*;
import java.util.stream.IntStream;

public class code_20211116 {

	public static void main(String[] args) {
		int n = 4;
		int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
		int answer = solution(n,costs);
		System.out.println(answer);
	}
	
	public static class Node{
		int row;
		int col;
		int dist;
		Node(int r, int c, int d){
			row = r;
			col = c;
			dist = d;
		}
	}
	
	public static int solution(int n, int[][] costs) {
        int answer = 0;
        List<Node> list = new ArrayList<>();
        int[] parent = IntStream.range(0, n).toArray();
        
        for(int i=0; i<costs.length; i++) {
        	list.add(new Node(costs[i][0],costs[i][1],costs[i][2]));
        }
        
        Collections.sort(list, (a,b) -> a.dist-b.dist);
        
        for(int i=0; i<list.size(); i++) {
        	Node node = list.get(i);
        	
        	if(find(parent[node.row],parent) != find(parent[node.col],parent)) {
        		union(node.row, node.col, parent);
        		answer += node.dist;
        	}
        }
        
        return answer;
    }
	
	public static int find(int x, int[] parent) {
		if(x == parent[x]) return x;
		return find(parent[x], parent);
	}
	
	public static void union(int x, int y, int[] parent) {
		x = find(x, parent);
		y = find(y, parent);
		
		if(x>y) {
			parent[x] = y;
		}else {
			parent[y] = x;
		}
	}
	
}
