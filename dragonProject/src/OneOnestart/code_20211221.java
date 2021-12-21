package OneOnestart;

public class code_20211221 {

	public static void main(String[] args) {
		String sentence = "HaEaLaLaObWORLDb";
		String answer = solution(sentence);
		System.out.println(answer);
	}
	
	static StringBuilder result = new StringBuilder();
	
	public static String solution(String sentence) {
		int idx = 0;
		boolean checked = true;
		if(sentence.indexOf(" ") > -1) return "invalid";
        
        while(sentence.length() > 0) {
        	idx = 0;
        	if(sentence.charAt(0) >= 'a' && sentence.charAt(0) <= 'z') {
        		idx = sentence.indexOf(sentence.charAt(0));
        		checked = strCase1(sentence.substring(1, idx-1));
        		if(!checked) return "invalid";
        		sentence = sentence.substring(idx);
        	}else if(sentence.charAt(1) >= 'a' && sentence.charAt(1) <= 'z'){
        		idx = 2;
        		while(sentence.indexOf(sentence.charAt(1),idx) != -1) {
        			idx = sentence.indexOf(sentence.charAt(1),idx);
        		}
        		if(idx+1 > sentence.length()) return "invalid";
        		checked = strCase2(sentence.substring(0, idx+1));
        		if(!checked) return "invalid";
        		sentence = sentence.substring(idx+1);
        	}else {
        		return "invalid";
        	}
        	
        }
        
        return result.toString();
    }

	private static boolean strCase1(String str) {
		boolean checked = false;
		for(char c : str.toCharArray()) {
			if(c >= 'a' && c <= 'z') checked = true;
		}
		
		if(checked) strCase2(str);
		else result.append(str);
		
		return true;
	}
	
	private static boolean strCase2(String str) {
		char temp = '*';
		for(char c : str.toCharArray()) {
			if(c >= 'a' && c <= 'z') {
				if(temp != '*' && temp != c) return false;
				temp = c;
			}
		}
		String[] spt = str.split(String.valueOf(temp));
		
		for(String string : spt) {
			result.append(string);
		}
		
		return true;
	}
	
}
