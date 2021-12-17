package OneOnestart;

import java.util.*;

public class code_20211217 {

	public static void main(String[] args) {
		String[] s = {"1110","100111100","0111111010"};
		String[] answer = solution(s);
		System.out.println("ss".substring(2,2));
		Arrays.stream(answer).forEach(System.out::println);
	}
	
	static String[] S;
	
	public static String[] solution(String[] s) {
        String[] answer = new String[s.length];
        S = s;
        
        for(int i=0; i<s.length; i++) {
        	
        	answer[i] = process(s[i]);
        	
        	
        }
        
        return answer;
    }

	private static String process(String str) {
		String result = str;
		int idx = 0;
    	Queue<String> q = new LinkedList<>();
    	Set<String> set = new HashSet<>();
    	
    	while(str.indexOf("110", idx) != -1) {
    		StringBuilder sb = new StringBuilder();
    		sb.append(str.substring(idx, str.indexOf("110", idx)));
    		sb.append(str.substring(str.indexOf("110", idx)+3, str.length()));
    		q.add(sb.toString());
    		idx = str.indexOf("110", idx)+3;
    	}
    	
    	while(!q.isEmpty()) {
    		String temp = q.poll();
    		StringBuilder sb = new StringBuilder();
    	}
    	
    	return result;
	}
	
}
