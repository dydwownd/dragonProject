package OneOnestart;

public class code_20211227 {
	
	public static void main(String[] args) {
		String s = "abcdcba";
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
		//���̸� ���ϰ�
		//������ġ���ϰ�
		//ó������ ++ �� ������--�� ��
		 for(int i=s.length(); i>0; i--) {
            for(int j=0; j+i<=s.length(); j++) {
                boolean isPalindrome = true;
                for(int k = 0; k < i / 2; k++) {
                    if(s.charAt(j + k) != s.charAt(j + i - k - 1)) {
                        isPalindrome = false;
                        break;
                    }
                }
                if(isPalindrome) return i;
            }
        }
        return 1;
    }
	
}
