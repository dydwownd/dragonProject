package OneOne2022;
import java.util.*;

public class code_20220215 {

/**
9 1
9 5 8 1 3 2 7 6 4
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] fluit = new int[N];

        for(int i=0; i<N; i++){
            fluit[i] = sc.nextInt();
        }

        Arrays.sort(fluit);

        for(int i=0; i<N; i++){
            if(fluit[i] <= L) L++;
            else break;
        }

        System.out.println(L);

    }

}
