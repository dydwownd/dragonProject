package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220721 {
//5585
/**
380
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 1000-Integer.parseInt(br.readLine());
        int[] money = {500,100,50,10,5,1};
        int answer = 0;

        for(int i=0; i<6; i++){
            answer += n/money[i];
            n = n%money[i];
        }

        System.out.println(answer);

    }
}
