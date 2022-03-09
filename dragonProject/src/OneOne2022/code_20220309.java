package OneOne2022;
import java.util.Arrays;
import java.util.Scanner;

public class code_20220309 {

/**
7
9 9 4 1 4 9 9
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int answer = 0;
        int val = 0;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(i != 0) val += arr[i];
        }

        for(int i=1; i<n; i++){
            int temp = val;
            temp -= arr[i];
            for(int j=i+1; j<n; j++){
                temp += arr[j];
            }
            answer = Math.max(answer,temp);
        }

        System.out.println(answer);
    }

}
