package OneOne2022;
import java.util.Scanner;

public class code_20220219 {

/**
5 3
6 3
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int answer = 0;
        long sum = (K+1)*(K/2) + ((K%2 == 0) ? 0 : (K+1)/2);

        if(sum > N){
            System.out.println("-1");
        }else{
            answer = (N%sum == 0) ? K-1 : K;
            System.out.println(answer);
        }

    }

}
