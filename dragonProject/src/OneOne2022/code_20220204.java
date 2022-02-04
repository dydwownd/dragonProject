package OneOne2022;
import java.util.Arrays;
import java.util.Scanner;

public class code_20220204 {

/** input
1
2 3
1 2
1 2
1 2
*/

/** output
2
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int[] answer = new int[R];

        for(int i=0; i<R; i++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            boolean[] book = new boolean[N];
            int[][] student = new int[M][2];
            int cnt = 0;

            for(int j=0; j<M; j++){
                student[j][0] = sc.nextInt();
                student[j][1] = sc.nextInt();
            }

            Arrays.sort(student,(o1,o2)->o1[1]-o2[1]);

            for(int j=0; j<M; j++){
                if(isPssible(student[j][0]-1,student[j][1]-1,book)) cnt++;
            }

            answer[i] = cnt;
        }

        Arrays.stream(answer).forEach(System.out::println);
    }

    private static boolean isPssible(int start, int end, boolean[] book) {

        for(int i=start; i<=end; i++){
            if(!book[i]){
                book[i] = true;
                return true;
            }
        }

        return false;
    }

}
