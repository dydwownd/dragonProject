package OneOnestart;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class code_20211113 {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1, 3, 5};
		int answer = solution(n,lost,reserve);
		System.out.println(answer);
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
        
		int answer = 0;
		
        boolean[] checked = new boolean[n];
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        Arrays.fill(checked, true);
        
        for(int i=0; i<lost.length; i++) {
        	checked[lost[i]-1] = false;
        }
        
        for(int i=0; i<reserve.length; i++) {
        	int temp = reserve[i]-1;
        	boolean ss = false;
        	
        	if(temp == 0) {
        		if(!checked[temp+1]) {
        			checked[temp+1] = true;
        			ss = true;
        		}
        	}else if(temp == n-1) {
        		if(!checked[temp-1]) {
        			checked[temp-1] = true;
        			ss = true;
        		}
        	}else {
        		if(!checked[temp-1]) {
        			checked[temp-1] = true;
        			ss = true;
        		}
        		else if(!checked[temp+1]) {
        			checked[temp+1] = true;
        			ss = true;
        		}
        	}
        	
        	if(!ss) {
        		if(!checked[temp]){
                    checked[temp] = true;
                    continue;
                }
        	}
        }
        
        for(int i=0; i<n; i++) {
        	if(checked[i]) answer++;
        }
        
        //(int)Stream.of(checked).filter(a -> a ? true : false).toArray().count()
        int[] test = new int[2];
        Arrays.stream(test).filter(a ->  a > 3).count();
        return answer;
    }
	
}
