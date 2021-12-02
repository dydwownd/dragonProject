package Study;

public class StringCompress {
	
	public static void main(String[] args) {
		
		System.out.println(solution("abcabcabcabcdededededede"));
	}
	
	public static int solution(String s) {
        int len = s.length();
        int answer = len;
        int process = len;
        boolean checked = true;
        
        int cnt = 0;
        
        for(int i=1; i<=len/2; i++){
            process = len;
            checked = true;
            for(int j=0; j<len; j=j+i){
            	if(j+i <= len && checked) {
	                String str = s.substring(j,j+i);
	                cnt = 0;
	                for(int k=j; k<len; k=k+i){
	                    if(k+i <= len && str.equals(s.substring(k,k+i))) cnt++;
	                    else break;
	                }
	                
	                if(cnt>1){
	                    process = process - (cnt*i) + i;
	                    if(cnt > 999){
	                        process += 4;
	                    }else if(cnt > 99){
	                        process += 3;
	                    }else if(cnt > 9){
	                        process += 2;
	                    }else{
	                        process += 1;
	                    }
	                }
                    if(j==0 && cnt<2){
                    	checked = false;
                    }
                }
            }
            if(answer > process){
                answer = process;
            }
        }
        return answer;
    }
}
