package OneOne2022;
import java.util.Arrays;
import java.util.Scanner;

public class code_20220203 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;
        int N = sc.nextInt();
        int[] tree = new int[N];

        for(int i=0; i<N; i++){
            tree[i] = sc.nextInt();
        }

        Arrays.sort(tree);

        for(int i=0; i<N; i++){
            answer = Math.max(tree[N-i-1]+i+2, answer);
        }

        System.out.println(answer);

    }

}
