package OneOne2022;

import java.util.*;

public class code_20220111 {

	public static void main(String[] args) {
		int n=8, k=2;
		String[] cmd = {"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z", "U 1", "C"};
		System.out.println(solution(n,k,cmd));
	}
	
	static int N;
	static boolean[] deleted;
	
	public static String solution(int n, int k, String[] cmd) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        N = n;
        deleted = new boolean[n];
        
        for(int i=0; i<cmd.length; i++) {
        	String spt[] = cmd[i].split(" ");
        	if("D".equals(spt[0])) {
        		k = move("D",Integer.parseInt(spt[1]),k);
        	}else if("U".equals(spt[0])) {
        		k = move("U",Integer.parseInt(spt[1]),k);
        	}else if("C".equals(spt[0])) {
        		stack.push(k);
        		k = delete(k);
        	}else if("Z".equals(spt[0])) {
        		if(!stack.isEmpty()) deleted[stack.pop()] = false;
        	}
        }
        
        for(int i=0; i<n; i++) {
        	sb.append(deleted[i] ? "X" : "O");
        }
        
        return sb.toString();
    }

	private static int delete(int k) {
		deleted[k] = true;
		int temp = k;
		
		for(int i=k-1; i>=0; i--) {
			if(!deleted[i]) {
				temp = i;
				break;
			}
		}
		
		for(int i=k+1; i<N; i++) {
			if(!deleted[i]) return i;
		}
		
		return temp;
	}

	private static int move(String str, int num, int k) {
		if(str.equals("D")) {
			int temp = k;
			while(num>0) {
				k++;
				if(k>N-1) return temp;
				if(!deleted[k]) {
					num--;
				}
			}
		}else {
			int temp = k;
			while(num>0) {
				k--;
				if(k<0) return temp;
				if(!deleted[k]) {
					num--;
				}
			}
		}
		return k;
	}
	
}
