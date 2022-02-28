package OneOne2022;
import java.util.Arrays;
import java.util.Scanner;

public class code_20220227 {

/**
8 7 5
1 3
2 5
3 5
4 8
5 8
6 9
6 7
7 10
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        int K = sc.nextInt();
        int[][] quiz = new int[N][2];
        int answer = 0;

        for(int i=0; i<N; i++){
            int easy = sc.nextInt();
            int hard = sc.nextInt();
            quiz[i][0] = easy;
            quiz[i][1] = hard;
        }

        Arrays.sort(quiz,(o1, o2) -> o1[1]-o2[1]);

        for(int i=0; i<N; i++){
            if(K==0) break;
            if(quiz[i][1] <= L){
                answer += 140;
                K--;
            }else if(quiz[i][0] <= L){
                answer += 100;
                K--;
            }
        }

        System.out.print(answer);
    }

}
