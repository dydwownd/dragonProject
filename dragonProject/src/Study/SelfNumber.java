package Study;

public class SelfNumber {

	public static void main(String[] args) {
		boolean[] visited = new boolean[12000];
		visited[0] = true;
		StringBuilder str = new StringBuilder();
		
		for(int i=1; i<10001; i++) {
			visited[process(i)] = true;
		}
		
		for(int i=1; i<10001; i++) {
			if(!visited[i]) str.append(i).append('\n');
		}
		
		System.out.println(str);
	}
	
	public static int process(int n) {
		String s = String.valueOf(n);
		
		for(int i=0; i<s.length(); i++) {
			n += Integer.parseInt(s.substring(i,i+1));
		}
		
		return n;
	}
	
}
