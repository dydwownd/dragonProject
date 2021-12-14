package OneOnestart;

import java.util.Arrays;
import java.util.HashMap;

public class code_20211214 {

	public static void main(String[] args) {
		String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
		String[] queries = {"fro??", "????o", "fr???", "fro???", "pro?"};
		int[] answer = solution(words,queries);
		Arrays.stream(answer).forEach(System.out::println);
	}
	
	public static class Trie{
		HashMap<Character,Trie> child;
		int cnt;
		
		Trie(){
			child = new HashMap<>();
		}
		
		public void insert(String word) {
			Trie curr = this;
			
			for(char c : word.toCharArray()) {
				if(!curr.child.containsKey(c)) {
					curr.child.put(c, new Trie());
				}
				curr.cnt++;
				curr = curr.child.get(c);
			}
			
		}
		
		public int search(String word) {
			Trie curr = this;
			
			for(char c : word.toCharArray()) {
				if(c == '?') return curr.cnt;
				curr = curr.child.get(c);
				
				if(curr == null)  return 0;
			}
			
			return curr.cnt;
		}
		
	}
	
	static Trie[] trie;
	static Trie[] rTrie;
	
	public static int[] solution(String[] words, String[] queries) {
        int[] answer = new int[queries.length];
        
        trie = new Trie[10000];
        rTrie = new Trie[10000];
        
        for(int i=0; i<words.length; i++) {
        	if(trie[words[i].length()] == null) {
        		trie[words[i].length()] = new Trie();
        		rTrie[words[i].length()] = new Trie();
        	}
        	StringBuilder sb = new StringBuilder();
        	rTrie[words[i].length()].insert(sb.append(words[i]).reverse().toString());
        	trie[words[i].length()].insert(words[i]);
        }
        
        for(int i=0; i<queries.length; i++) {
        	if(trie[queries[i].length()] == null) continue;
        	
        	StringBuilder sb = new StringBuilder();
        	if(queries[i].charAt(0) == '?') {
        		answer[i] = rTrie[queries[i].length()].search(sb.append(queries[i]).reverse().toString());
        	}else {
        		answer[i] = trie[queries[i].length()].search(queries[i]);
        	}
        }
        
        return answer;
    }
	
}
