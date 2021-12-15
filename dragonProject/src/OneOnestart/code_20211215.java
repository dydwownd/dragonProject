package OneOnestart;

import java.util.*;

public class code_20211215 {
 
	public static void main(String[] args) {
		String[] strs = {"ba","na","n","a"};
		String t = "banana";
		int answer = solution(strs,t);
		System.out.println(answer);
	}
	
	public static int solution(String[] strs, String t) {
        Graph graph = new Graph();
        
        for (int i = 0; i < strs.length; i++) {
            String thisStr = strs[i];
            
            int a = 0;
            int count = 0;
            while (a != -1){
                int add = 0;
                if (count > 0) {
                    add = 1;
                }
                int start = t.indexOf(thisStr, a + add);
                int end = start + thisStr.length();
                if (start != -1) {
                    if (graph.containsNode(start)) {
                        Node node = graph.getNode(start);
                        node.addEdge(end);
                    }
                    else {
                        Node node = new Node(start);
                        node.addEdge(end);
                        graph.addNode(node);
                    }
                    
                }
                a = start;
                count ++;
            } 
        }        
            
        return graph.shortestPath(t.length(), t.length());
    }
	
	public static class Graph{
	    public HashMap<Integer, Node> nodeMap = new HashMap<Integer, Node>();

	    public Graph() {
	        nodeMap = new HashMap<Integer, Node>();
	    }
	    
	    public void addNode(Node node) {
	        nodeMap.put(node.source, node);
	    }
	    
	    public boolean containsNode(int source) {
	        return nodeMap.containsKey(source);
	    }
	    
	    public Node getNode(int index) {
	        return nodeMap.get(index);
	    }
	    
	    public int shortestPath(int end, int strLeng) {
	        Queue<int[]> queue = new LinkedList<>();
	        boolean visited[] = new boolean[strLeng];
	        
	        queue.add(new int[]{0, 0});
	        visited[0] = true;
	                
	        while (queue.size() > 0) {
	            int[] currentNode = queue.poll();
	            if (nodeMap.containsKey(currentNode[0])){
	                ArrayList<Integer> destArr = nodeMap.get(currentNode[0]).destArr;
	                for (int i = 0; i < destArr.size(); i++) {
	                    if (destArr.get(i) == end) {
	                        return currentNode[1] + 1;
	                    }
	                    if (!visited[destArr.get(i)]){
	                        visited[destArr.get(i)] = true;
	                        queue.add(new int[]{destArr.get(i), currentNode[1] + 1}); 
	                    }           
	                }
	            }
	            
	        }
	        return -1;
	    }
	      
	}
	
	public static class Node {
	    public int source;
	    public ArrayList<Integer> destArr;
	    
	    public Node(int source) {
	        this.source = source;
	        this.destArr = new ArrayList<Integer> ();
	    }
	    
	    public void addEdge(int end) {
	        destArr.add(end);
	    }
	}

}
