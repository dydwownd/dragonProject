package OneOne2022;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class code_20220325 {

/**
4 4 3
4 5.0 2 4.0 3 2.0 1 1.0
2 2.0 3 1.0 1 0.5 4 0.3
4 6.0 3 5.0 2 2.0 1 0.0
1 4.0 2 3.0 4 0.6 3 0.3
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        double[] score = new double[n];
        double answer = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int idx = sc.nextInt()-1;
                double val = sc.nextDouble();
                score[idx] = Math.max(score[idx],val);
            }
        }

        Arrays.sort(score);

        for(int i=0; i<k; i++){
            answer += score[n-i-1];
        }

        System.out.println(String.format("%.1f",answer));

    }

}
