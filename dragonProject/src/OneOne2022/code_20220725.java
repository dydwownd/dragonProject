package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220725 {
//1789
/**
200
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        long sum = 0;
        long answer = 0;

        for(long i=1; i<Long.MAX_VALUE; i++){
            sum += i;
            if(sum>n){
                answer = i-1;
                break;
            }
        }

        System.out.println(answer);

    }
}
