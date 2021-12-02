package OneOnestart;

public class code_20211114 {

	public static void main(String[] args) {
		String name = "AAAAAAAAABA";
		int answer = solution(name);
		System.out.println(answer);
	}
	
	
	public static int solution(String name) {
		int a = name.chars().map(c -> Math.min(Math.abs(65-c), Math.abs(91-c))).sum();
		int b = name.length()-1;
		for(int i=0; i<name.length(); i++) {
			int next = i+1;
			while(next<name.length() && name.charAt(next) == 'A') next++;
				
			b = Math.min(b, i+name.length()-next+i);
		}
        return a + b;
    }
	
}
