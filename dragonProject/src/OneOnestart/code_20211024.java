package OneOnestart;

import java.util.*;

public class code_20211024 {

	public static void main(String[] args) {
		String s = "((";
		int answer = solution(s);
		System.out.println(answer);
	}
	
	public static int solution(String s) {
        int answer = 0;
        
        for(int i=0; i<s.length(); i++) {
        	if(isString(s)) answer++;
        	s = s.substring(1) + s.substring(0,1);
        }
        
        return answer;
    }

	private static boolean isString(String str) {
		Stack<Character> stack = new Stack<>();
		
		Queue<Character> q = new LinkedList<>();
        
        for(char c : str.toCharArray()) {
        	q.offer(c);
        }
		
		while(!q.isEmpty()) {
			char c = q.poll();
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}else if(c == ')') {
				if(stack.isEmpty()) return false;
				if(stack.peek() == '(') stack.pop();
				else return false;
			}else if(c == '}') {
				if(stack.isEmpty()) return false;
				if(stack.peek() == '{') stack.pop();
				else return false;
			}else if(c == ']') {
				if(stack.isEmpty()) return false;
				if(stack.peek() == '[') stack.pop();
				else return false;
			}
		}
		
		if(!stack.isEmpty()) return false;
		
		return true;
	}
	
}
