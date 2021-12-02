package OneOnestart;

public class code_20211115 {

	public static void main(String[] args) {
		String number = "1231234";
		int k = 3;
		String answer = solution(number,k);
		System.out.println(answer);
	}
	
	public static String solution(String number, int k) {
		long answer = 0;
		int len = number.length();
		int[] value = number.chars().map(i -> Math.abs(48-i)).toArray();
        
		for(int i=0; i<1<<len; i++) {
			if(Integer.bitCount(i) == len-k) {
				StringBuilder str = new StringBuilder();
				String temp = Integer.toBinaryString(i);
				for(int j=0; j<temp.length(); j++) {
					if(temp.charAt(j) == '1') str.append(value[len-temp.length()+j]);
				}
				answer = Math.max(answer, Integer.parseInt(str.toString()));
			}
		}
		
        return String.valueOf(answer);
    }
	
}
