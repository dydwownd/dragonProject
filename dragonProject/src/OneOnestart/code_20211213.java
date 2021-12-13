package OneOnestart;

import java.util.Arrays;

public class code_20211213 {

	public static void main(String[] args) {
		String[] lines = {"2016-09-15 20:59:57.421 0.351s",
				"2016-09-15 20:59:58.233 1.181s",
				"2016-09-15 20:59:58.299 0.8s",
				"2016-09-15 20:59:58.688 1.041s",
				"2016-09-15 20:59:59.591 1.412s",
				"2016-09-15 21:00:00.464 1.466s",
				"2016-09-15 21:00:00.741 1.581s",
				"2016-09-15 21:00:00.748 2.31s",
				"2016-09-15 21:00:00.966 0.381s",
				"2016-09-15 21:00:02.066 2.62s"};
		int answer = solution(lines);
		System.out.println(answer);
	}

	public static int solution(String[] lines) {
		int answer = 0;
        int[] timeStart = new int[lines.length];
        int[] timeEnd = new int[lines.length];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<lines.length; i++) {
        	String[] spt = lines[i].split(" ");
        	int ex = Integer.parseInt(spt[2].replace(".", "").replace("s", ""));
        	int time = Integer.parseInt(spt[1].substring(0,2)) *1000 * 60 * 60;
        	time += Integer.parseInt(spt[1].substring(3,5)) *1000 * 60;
        	time += Integer.parseInt(spt[1].substring(6,8)) *1000;
        	min = Math.min(min, time);
        	max = Math.max(max, time);
        	time += Integer.parseInt(spt[1].substring(9,12));
        	
        	timeStart[i] = time;
        	timeEnd[i] = time + ex;
        }
        
        for(int i=min; i<=max; i+=1000) {
        	boolean[] vistied = new boolean[lines.length];
        	for(int j=min; j<min+1000; j++) {
        		for(int k=0; k<lines.length; k++) {
        			
        		}
        	}
        	
        	int cnt = 0;
        	for(int j=0; j<lines.length; j++) {
        		if(timeStart[j] <= i && i <= timeEnd[j]) cnt++;
        	}
        	answer = Math.max(answer, cnt);
        }
        
        return answer;
    }
	
//	public static int solution(String[] lines) {
//        int[] times = new int[24*1000*60*60];
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        
//        for(int i=0; i<lines.length; i++) {
//        	String[] spt = lines[i].split(" ");
//        	int cnt = Integer.parseInt(spt[2].replace(".", "").replace("s", ""));
//        	int time = Integer.parseInt(spt[1].substring(0,2)) *1000 * 60 * 60;
//        	time += Integer.parseInt(spt[1].substring(3,5)) *1000 * 60;
//        	time += Integer.parseInt(spt[1].substring(6,8)) *1000;
//        	time += Integer.parseInt(spt[1].substring(9,12));
//        	
//        	min = Math.min(min, time);
//        	max = Math.max(max, time);
//        	
//        	for(int j=time; j<=time+cnt; j++) {
//        		times[j]++;
//        	}
//        }
//                
//        
//        return Arrays.stream(Arrays.copyOfRange(times, min, max+1)).max().getAsInt();
//    }
	
}
