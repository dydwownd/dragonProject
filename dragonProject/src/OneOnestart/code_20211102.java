package OneOnestart;

public class code_20211102 {

	public static void main(String[] args) {
		String number = "87654321";
		int k = 3;
		String answer = solution(number,k);
		System.out.println(answer);
	}
	
	static char[] Number;
    static int answer;
	
	public static String solution(String number, int k) {
        int len = number.length();
        Number = number.toCharArray();
        answer = 0;
        
        nCr(len,len-k,new boolean[len],0);
        
        return String.valueOf(answer);
    }
    
    private static void nCr(int n, int r, boolean[] visited, int idx) {
		if(r==0) {
			StringBuilder str = new StringBuilder();
			for(int i=0; i<n; i++) {
				if(visited[i]) str.append(Number[i]);
			}
			answer = Math.max(answer, Integer.parseInt(str.toString()));
		}else {
			for(int i=idx; i<n; i++) {
				visited[i] = true;
				nCr(n,r-1,visited,i+1);
				visited[i] = false;
			}
		}
	}
	
}
