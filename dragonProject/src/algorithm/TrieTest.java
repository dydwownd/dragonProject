package algorithm;

public class TrieTest {

	public static void main(String[] args) {
		String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
		String[] queries = {"fro??", "????o", "fr???", "fro???", "pro?"};
		
		int[] result = solution(words,queries);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static class Trie{
		Trie[] child = new Trie[26];
		int count = 0;
		
		public void insert(String str){
			Trie cur = this;
			for(char c : str.toCharArray()) {
				cur.count++;
				int idx = Character.getNumericValue(c) - aCharNum;
				if(cur.child[idx] == null) {
					cur.child[idx] = new Trie();
				}
				
				cur = cur.child[idx];

			}
			cur.count++;
		}
		
		public int search(String str) {
			Trie cur = this;
			for(char c : str.toCharArray()) {
				if(c == '?') {
					return cur.count;
				}else {
					cur = cur.child[Character.getNumericValue(c) - aCharNum];
					
					if(cur == null) {
						return 0;
					}
				}
			}
			return cur.count;
		}
	}

	static int aCharNum = Character.getNumericValue('a');
	static Trie[] root;
	static Trie[] reverseRoot;
	
	private static int[] solution(String[] words, String[] queries) {
		int[] answer = new int[queries.length];
		int ansIdx = 0;
		root = new Trie[10000];
		reverseRoot = new Trie[10000];
		
		for(int i=0; i<words.length; i++) {
			int idx = words[i].length()-1;
			
			if(root[idx] == null) {
				root[idx] = new Trie();
				reverseRoot[idx] = new Trie();
			}
			
			root[idx].insert(words[i]);
			reverseRoot[idx].insert(new StringBuilder(words[i]).reverse().toString());
		}
		
		for(int i=0; i<queries.length; i++) {
			int idx = queries[i].length()-1;
			
			if(root[idx] == null) {
				answer[ansIdx++] = 0;
				continue;
			}
			
			if(queries[i].charAt(0) == '?') {
				answer[ansIdx++] = reverseRoot[idx].search(new StringBuilder(queries[i]).reverse().toString());
			}else {
				answer[ansIdx++] = root[idx].search(queries[i]);
			}
		}
		
		return answer;
	}
	
}
