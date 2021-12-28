package OneOnestart;

import java.util.*;

public class code_20211228 {

	public static void main(String[] args) {
		int[] food_times = {3,1,2};
		long k = 5;
		System.out.println(solution(food_times,k));
	}
	
	public static class Food{
		int idx;
		int time;
		Food(int i, int t){
			idx = i;
			time = t;
		}
	}
	
	public static int solution(int[] food_times, long k) {
        int time = 0;
        List<Food> list = new ArrayList<>();
        
        for(int i=0; i<food_times.length; i++) {
        	list.add(new Food(i,food_times[i]));
        }
        
        Collections.sort(list,(a,b)->a.time-b.time);
        
        for(int i=0; i<food_times.length; i++) {
        	Food temp = list.get(0);
        	if((temp.time-time)*list.size()<k) {
        		k -= (temp.time-time)*list.size();
        	}else {
        		int num = ((temp.time-time)*list.size()) % (int)k;
        		Collections.sort(list,(a,b)->a.idx-b.idx);
        		return list.get(num).idx+1;
        	}
        	time = temp.time;
        	list.remove(0);
        }
        
        return -1;
    }
	
}
