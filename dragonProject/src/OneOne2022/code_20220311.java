package OneOne2022;
import java.util.Scanner;

public class code_20220311 {

/**
88 17
3
18
1
42
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int temp = 0;
        int answer = Math.abs(A-B)+1;
        int diff = 100;

        for(int i=0; i<N; i++){
            temp = sc.nextInt();
            diff = Math.min(diff,Math.abs(B-temp)+1);
        }
        answer = Math.min(answer,diff);

        System.out.println(answer);
    }

}
