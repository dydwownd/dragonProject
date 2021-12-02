package OneOnestart;

import java.util.*;

public class code_20211027 {

	public static void main(String[] args) {
		String s = "3people unFollowed me";
		String answer = solution(s);
		System.out.println(answer);
	}
	
	public static String solution(String s) {
        StringBuilder str = new StringBuilder();
        s = s.toLowerCase();
        str.append(String.valueOf(s.charAt(0)).toUpperCase());
        
        for(int i=1; i<s.length(); i++) {
        	if(s.charAt(i) == ' ') {
        		if(s.charAt(i-1) == ' ') continue;
        		else str.append(s.charAt(i));
        	}else if(s.charAt(i-1) == ' ') {
        		str.append(String.valueOf(s.charAt(i)).toUpperCase());
        	}else {
        		str.append(s.charAt(i));
        	}
        }
        
        return str.toString();
    }
	
}
