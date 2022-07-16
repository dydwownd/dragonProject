package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220716 {
//2839
/**
18
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int temp = n/5;
        int answer = -1;

        for(int i = temp; i>=0; i--){
            int kg3 = (n-(5*i))/3;
            if((i*5) + (kg3*3) == n){
                answer = i+kg3;
                break;
            }
        }

        if(answer == -1) System.out.println(-1);
        else System.out.println(answer);
    }
}
