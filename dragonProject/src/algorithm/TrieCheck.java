package algorithm;

import java.util.*;

public class TrieCheck {

	public static void main(String[] args) {
		String[] words = {"word","war","warrior","world"};
		int answer = solution(words);
		System.out.println(answer);
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
				curr = curr.child.get(c);
				curr.cnt++;
			}
			
		}
		
		public int search(String word) {
			Trie curr = this;
			int result = 0;
			
			for(char c : word.toCharArray()) {
				curr = curr.child.get(c);
				result++;
				if(curr.cnt == 1) break;
			}
			
			return result;
		}
		
	}

	private static int solution(String[] words) {
		int answer = 0;
		
		Trie root = new Trie();
		
		for(String s : words) {
			root.insert(s);
		}
		
		for(String s : words) {
			answer += root.search(s);
		}
		
		return answer;
	}
	
}
