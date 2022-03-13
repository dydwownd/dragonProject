package OneOne2022;
import java.util.Scanner;

public class code_20220313 {

/**
ZOAC
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int answer = 0;
        char now = 'A';

        for(char c : str.toCharArray()){
            answer += Math.min(26-Math.abs(now-c), Math.abs(now-c));
            now = c;
        }

        System.out.println(answer);
    }

}
