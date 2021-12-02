package algorithm;

import java.util.*;

public class LRU {

	public static void main(String[] args) {
		int cacheSize = 3;
		String[] cities = {"Jeju","Pangyo","Seoul","NewYork","Jeju","Pangyo","Seoul","NewYork","LA"};
		int answer = solution(cacheSize,cities);
		System.out.println(answer);
	}

	private static int solution(int cacheSize, String[] cities) {
		int hit = 1;
		int miss = 5;
		int answer = 0;
		
		if(cacheSize == 0) return cities.length * miss;
		
		LinkedList<String> list = new LinkedList<String>();
		
		for(String s : cities) {
			s  = s.toLowerCase();
			
			if(list.remove(s)) {//hit
				list.offer(s);
				answer += hit;
			}else {
				if(cacheSize == list.size()) {
					list.poll();
				}
				list.offer(s);
				answer += miss;
			}
		}
		
		return answer;
	}
	
}
