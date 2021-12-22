package OneOnestart;

public class code_20211222 {

	public static void main(String[] args) {
		int n = 10;
		int[] money = {3,5,7,8};
		int answer = solution(n,money);
		System.out.println(answer);
	}
	
	public static int solution(int n, int[] money) {
        int[] answer = new int[100001];
        answer[0] = 1;
        for(int i : money) {
        	for(int j=i; j<=n; j++) {
        		answer[j] += answer[j-i];
        	}
        }
        
        return answer[n];
    }
	
}
