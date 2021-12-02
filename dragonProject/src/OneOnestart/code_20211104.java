package OneOnestart;

import java.util.*;

public class code_20211104 {

	public static void main(String[] args) {
		String[] phone_book = {"123","456","789"};//{"119", "97674223", "1195524421"};
		boolean answer = solution(phone_book);
		System.out.println(answer);
	}
	
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
        Map<String,Integer> map = new HashMap<>();
        
        for(int i=0; i<phone_book.length; i++) {
        	map.put(phone_book[i],i);
        }

        for(int i=0; i<phone_book.length; i++) {        	
        	for(int j=1; j<phone_book[i].length(); j++) {//큰길이 데이터 기준에서 잘라가며 자기자신 앞부분이 있는지 확인
        		if(map.containsKey(phone_book[i].substring(0,j)))  return false;          
        	}
        }
        
        return answer;
    }
	
}
