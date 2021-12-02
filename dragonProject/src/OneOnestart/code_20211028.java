package OneOnestart;

import java.util.*;

public class code_20211028 {

	public static void main(String[] args) {
		String m = "CCB";
		String[] musicinfos = {"03:00,03:10,FOO,CCB#CCB", "04:00,04:08,BAR,ABC"};
		String answer = solution(m,musicinfos);
		System.out.println(answer);
	}
	
	public static String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int now = 0;
        //C, C#, D, D#, E, F, F#, G, G#, A, A#, B
        
        m = replaceData(m);
        
        for(String str : musicinfos) {
        	String[] spt = str.split(",");
        	String[] time = spt[0].split(":");
        	spt[3] = replaceData(spt[3]);
        	int start = 60*Integer.parseInt(time[0])+Integer.parseInt(time[1]);
        	time = spt[1].split(":");
        	int end = 60*Integer.parseInt(time[0])+Integer.parseInt(time[1]);
        	int len = spt[3].length();
        	StringBuilder sb = new StringBuilder();
        	
        	for(int i=0; i<end-start; i++) {
        		sb.append(spt[3].charAt(i%len));
        	}
        	
        	if(sb.toString().contains(m)) {
        		if(now < end-start) {
        			now = end-start;
        			answer = spt[2];
        		}
        	}
        }
        
        return answer;
    }

	private static String replaceData(String string) {
		return string.replace("C#", "c").replace("D#", "d").replace("F#", "f").replace("G#", "g").replace("A#", "a");
	}
	
}
