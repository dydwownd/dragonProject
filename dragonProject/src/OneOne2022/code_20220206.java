package OneOne2022;
import java.util.Arrays;
import java.util.Scanner;

public class code_20220206 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] rank = new int[N];
        int answer = 0;

        for(int i=0; i<N; i++){
            rank[i] = sc.nextInt();
        }

        Arrays.sort(rank);

        for(int i=0; i<N; i++){
            if(rank[i] - (i+1) < 0)  answer += (i+1) - rank[i];
        }

        System.out.println(answer);

    }

}
