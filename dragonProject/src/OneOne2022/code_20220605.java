package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220605 {

/**
4
132
1000
7
111111111111111110
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=1; i<=T; i++){

            int answer = result(Integer.parseInt(br.readLine()));

            System.out.println("Case #" + i + ": "+answer);
        }

    }

    private static int result(int num) {
        int result = num;

        for(int i=num; i>0; i--){
            if(possible(String.valueOf(i))){
                result = i;
                break;
            }
        }

        return result;
    }

    private static boolean possible(String str) {
        if(str.length() == 1) return true;

        for(int i=str.length()-1; i>0; i--){
            if(str.charAt(i) < str.charAt(i-1)) return false;
        }

        return true;
    }

}
