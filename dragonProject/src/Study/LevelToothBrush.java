package Study;

import java.util.*;

public class LevelToothBrush {

	public static void main(String[] args) {
		String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
		String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
		String[] seller = {"young", "john", "tod", "emily", "mary"};
		int[] amount = {12, 4, 2, 5, 10};
		
		int[] answer = solution(enroll,referral,seller,amount);
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
	
	public static class Node{
		String name;
		Node parents;
		int amount;
		
		public Node(String n) {
			name = n;
			parents = null;
			amount = 0;
		}
	}
	
	static HashMap<String,Node> hm = new HashMap<String,Node>();
	
	private static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
		int len = enroll.length;
		int[] answer = new int[len];
		
		hm.put("root", new Node("root"));
		
		for(int i=0; i<len; i++) {
			hm.put(enroll[i],new Node(enroll[i]));
		}
		
		for(int i=0; i<len; i++) {
			if("-".equals(referral[i])) {
				hm.get(enroll[i]).parents = hm.get("root");
			}else {				
				hm.get(enroll[i]).parents = hm.get(referral[i]);
			}
		}
		
		for(int i=0; i<seller.length; i++) {
			process(hm.get(seller[i]),amount[i]*100);
		}
		
		for(int i=0; i<len; i++) {
			answer[i] = hm.get(enroll[i]).amount;
		}
		
		return answer;
	}

	private static void process(Node node, int money) {
		if(node.parents != null) {
			int calc = money/10;
			node.amount += (money-calc);
			process(node.parents,calc);
		}
		if(node.parents == null) {
			node.amount += money;
		}
		
	}
	
}
