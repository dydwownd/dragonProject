package Study;

import java.util.*;

public class test {

	public static void main(String[] args) {
		//String number = "12";
		//System.out.println(number.substring(0, 1));
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Node> queue = new PriorityQueue<Node>(new Comparator<Node>() {
			public int compare(Node a, Node b) {
				return a.a-b.b;
			}
		});
		
		List<Node> list = new ArrayList<Node>();
		
		list.add(new Node(1,1));
		list.add(new Node(2,2));
		list.add(new Node(3,3));
		list.add(new Node(4,4));
		
		list.get(2).b = 99;
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("a°ª : " + list.get(i).a + ", b°ª : " + list.get(i).b);
		}
	}
	
	public static class Node{
		int a;
		int b;
		public Node(int x, int y) {
			a = x;
			b = y;
		}
	}
	
}
