package OneOnestart;

import java.util.*;

public class code_20211112 {

	public static void main(String[] args) {
		
	}
	
	Set<Integer> list;
	char[] nums;
    
    public int solution(String numbers) {
        int len = numbers.length();
        list = new HashSet<Integer>();
        nums = new char[len];
        
        for(int i=0; i<len; i++) {
        	nums[i] = numbers.charAt(i);
        }
        
        for(int i=1; i<=numbers.length(); i++) {
        	nPr(len,i,new boolean[len],new char[len],0);
        }
        
        return list.size();
    }
    
    private boolean isPrime(Integer next) {
		if(next < 2) return false;
        if(next == 2) return true;
		
        for(int i=2; i<next; i++) {
        	if(next%i == 0) return false;
        }
		
		return true;
	}

	private void nPr(int n, int r, boolean[] visited, char[] result, int idx) {
		if(r==idx) {
			StringBuilder str = new StringBuilder();
			for(int i=0; i<r; i++) {
				str.append(result[i]);
			}
			if(isPrime(Integer.parseInt(str.toString()))) list.add(Integer.parseInt(str.toString()));
		}else {
			for(int i=0; i<n; i++) {
				if(!visited[i]) {
					visited[i] = true;
					result[idx] = nums[i];
					nPr(n,r,visited,result,idx+1);
					visited[i] = false;
				}
			}
		}
	}
	
}
