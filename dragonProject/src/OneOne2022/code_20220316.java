package OneOne2022;
import java.util.Arrays;
import java.util.Scanner;

public class code_20220316 {

/**
8
6 15 21
7 20 25
1 3 8
3 2 14
8 6 27
2 7 13
4 12 18
5 6 20
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int min = 1000000000;
        int max = 0;
        int answer = 0;

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            int start = sc.nextInt();
            int end = sc.nextInt();
            min = Math.min(min, start);
            max = Math.max(max, end);
            arr[i][0] = start;
            arr[i][1] = end;
        }

        int val = max-min;
        int[] time = new int[val+1];

        for(int i=0; i<n; i++){
            for(int j=arr[i][0]; j<=arr[i][1]; j++){
                time[j-min]++;
            }
        }

        for(int i=0; i<=val; i++){
            answer = Math.max(answer,time[i]);
        }

        System.out.println(answer);

    }

}
