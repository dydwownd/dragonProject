package OneOne2022;
import java.util.Arrays;
import java.util.Scanner;

public class code_20220225 {

/**
5 4
2
8
10
7
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] eggs = new int[M];
        int price = 0;
        int total = 0;

        for(int i=0; i<M; i++){
            eggs[i] = sc.nextInt();
        }

        Arrays.sort(eggs);

        for(int i=0; i<M; i++){
            int cnt = (M-i) > N ? N : (M-i);
            if(eggs[i] * cnt > total){
                price = eggs[i];
                total = eggs[i] * cnt;
            }
        }

        System.out.printf("%d %d",price,total);

    }

}
