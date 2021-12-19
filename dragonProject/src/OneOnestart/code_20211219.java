package OneOnestart;

import java.util.*;

public class code_20211219 {

	public static void main(String[] args) {
		String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
		String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
		String[] seller = {"young", "john", "tod", "emily", "mary"};
		int[] amount = {12, 4, 2, 5, 10};
		int[] answer = solution(enroll,referral,seller,amount);
		Arrays.stream(answer).forEach(System.out::println);
	}
		
	public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        
        Map<String,String> MeAndParent = new HashMap<>();
        Map<String,Integer> MeAndIdx = new HashMap<>();
        
        for(int i=0; i<enroll.length; i++) {
        	MeAndParent.put(enroll[i], referral[i]);
        	MeAndIdx.put(enroll[i], i);
        }
        
        for(int i=0; i<seller.length; i++) {
        	String temp = seller[i];
        	int money = amount[i]*100;
        	
        	while(!"-".equals(temp)) {
        		int give = money/10;
        		int take = money-give;
        		
        		money = give;
        		answer[MeAndIdx.get(temp)] += take;
        		
        		if(give < 1) break;
        		
        		temp = MeAndParent.get(temp);
        	}
        }
        
        return answer;
    }
	
}
