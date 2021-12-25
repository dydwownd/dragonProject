package OneOnestart;

import java.util.*;

public class code_20211225 {

	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
		System.out.println(solution(begin,target,words));
	}
	
	static String[] Words;
	
	public static class WordClass{
		String word;
		int cnt;
		WordClass(String w, int c){
			word = w;
			cnt = c;
		}
	}
	
	public static int solution(String begin, String target, String[] words) {
        int answer = 0;
        Words = words;
        
        Queue<WordClass> q = new LinkedList<WordClass>();
        boolean[] visited = new boolean[words.length];
        
        q.offer(new WordClass(begin,0));
        
        while(!q.isEmpty()) {
        	WordClass now = q.poll();
        	if(target.equals(now.word)) return now.cnt;
        	
        	for(int i=0; i<words.length; i++) {
        		if(isChange(now.word,i) && !visited[i]) {
        			visited[i] = true;
        			q.offer(new WordClass(words[i],now.cnt+1));
        		}
        	}
        }
        
        return answer;
    }

	private static boolean isChange(String word, int i) {
		if(Words[i].length() != word.length()) return false;
		int cnt = 0;
		
		for(int j=0; j<word.length(); j++) {
			if(word.charAt(j) != Words[i].charAt(j)) cnt++;
			if(cnt>1) return false;
		}
		
		return true;
	}
	
}
