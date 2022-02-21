package OneOne2022;
import java.util.Arrays;
import java.util.Scanner;

public class code_20220221 {

/**
3
5
WBBWW
WBWBW
7
BBBBBBB
BWBWBWB
4
WWBB
BBWB
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] answer = new int[T];

        for(int i=0; i<T; i++){
            int N = sc.nextInt();
            int Wcnt = 0;
            int Bcnt = 0;
            String data = sc.next();
            String target = sc.next();

            for(int j=0; j<N; j++){
                if(data.charAt(j) != target.charAt(j)){
                    if(target.charAt(j) == 'W') Wcnt++;
                    else Bcnt++;
                }
            }

            answer[i] += Math.min(Wcnt,Bcnt) + Math.abs(Wcnt-Bcnt);
        }

        Arrays.stream(answer).forEach(System.out::println);
    }

}
