package OneOne2022;
import java.util.Scanner;

public class code_20220210 {

/**
7
20 1
2 1
10 3
100 2
8 2
5 20
50 10
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] school = new int[10001];
        int max = 0;
        int answer = 0;

        for(int i=0; i<n; i++){
            int p = sc.nextInt();
            int d = sc.nextInt();
            max = Math.max(max,d);
            school[d] = Math.max(school[d], p);
        }

        for(int i=0; i<=max; i++){
            answer += school[i];
        }

        System.out.println(answer);
    }

}
