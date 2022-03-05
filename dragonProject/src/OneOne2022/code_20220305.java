package OneOne2022;
import java.util.Arrays;
import java.util.Scanner;

public class code_20220305 {

/**
3
12 2
200
50
300
100
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int C = sc.nextInt();
        int[] topping = new int[N];
        int T = 0;
        int answer = C/A;

        for(int i=0; i<N; i++){
            topping[i] = sc.nextInt();
        }

        Arrays.sort(topping);

        for(int i=0; i<N; i++){
            T += topping[N-i-1];
            answer = Math.max(answer,(C+T)/(A+(B*(i+1))));
        }

        System.out.println(answer);

    }

}
