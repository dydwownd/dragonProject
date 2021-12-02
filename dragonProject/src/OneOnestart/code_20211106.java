package OneOnestart;

public class code_20211106 {

	public static void main(String[] args) {
		
		long[] numbers = {2,7};
		long[] answer = solution(numbers);
		for(long i : answer) {
			System.out.println(i);
		}
		
	}
	
	public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
        	answer[i] = nextNum(numbers[i]);
        }
        
        return answer;
    }

	private static long nextNum(long l) {
		for(long i=l+1; i<Long.MAX_VALUE; i++) {
			if(checkBit(Integer.toBinaryString((int)l) ,Integer.toBinaryString((int)i))) return i;
		}
		return 0;
	}

	private static boolean checkBit(String binaryString, String binaryString2) {
		int len1 = binaryString.length();
		int len2 = binaryString2.length();
		int cnt = 0;
		
		while(len1 < len2) {
			binaryString = "0"+binaryString;	
		}
		
		for(int i=0; i<binaryString.length(); i++) {
			if(binaryString.charAt(i) != binaryString2.charAt(i)) cnt++;
			if(cnt > 2) return false;
		}
		
		return true;
		
	}
	
}
