package OneOne2022;
import java.util.Scanner;

public class code_20220212 {

/**
4
5 1 7 9
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int[] antena = new int[n];
        int avg = 0;
        int idx = -1;
        int val = n;

        for(int i=0; i<n; i++){
            antena[i] = sc.nextInt();
            sum += antena[i];
        }

        avg = sum/n;

        for(int i=0; i<n; i++){
            if(Math.abs(avg-antena[i]) < val) {
                val = Math.abs(avg-antena[i]);
                idx = i;
            }
        }

        System.out.println(idx);
    }

}
