package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220530 {

/**
14
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[] calc = {'+','-','*','/'};//+-*/ : +2 -2 *2 /2
        int answer = 1;
        long number = 2;

        StringBuilder sb = new StringBuilder();
        sb.append(0);

        while(number != N && answer < 99){
            if(number*2 <= N){
                number *= 2;
                sb.append(2);
            }else if(number/2 == N){
                number /= 2;
                sb.append(3);
            }else if(number-2 >= N){
                number -= 2;
                sb.append(1);
            }else if(number+2 <= N){
                number += 2;
                sb.append(0);
            }
            answer++;
        }

        if(answer == 99) System.out.print(-1);
        else{
            System.out.println(answer);
            String temp = sb.toString();
            for(int i=0; i<answer; i++){
                System.out.print("[" + calc[Integer.parseInt(temp.substring(i,i+1))] + "] ");
            }
        }
    }
}
