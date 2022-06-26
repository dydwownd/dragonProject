package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220626 {
//25215
/**
iLoveINHA
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int answer = 0;

        boolean checked = false;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                if(checked){
                    if(i+1 < str.length() && str.charAt(i+1) >= 'a' && str.charAt(i+1) <= 'z'){
                        checked = false;
                    }
                    answer++;
                }
            }else{
                if(!checked){
                    if(i+1 < str.length() && str.charAt(i+1) >= 'A' && str.charAt(i+1) <= 'Z'){
                        checked = true;
                    }
                    answer++;
                }
            }
            answer++;
        }

        System.out.println(answer);
    }
}
