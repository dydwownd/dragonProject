package OneOne2022;
import java.util.Scanner;

public class code_20220323 {

/**
7
321 -1 88 777 105 456 88
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long answer = 0;
        int min = 1000000000;

        for(int i=0; i<n; i++){
            int temp = sc.nextInt();
            if(temp == -1 && min != 1000000000){
                answer += min;
                min = 1000000000;
            }else{
                min = Math.min(min,temp);
            }
        }

        if(min != 1000000000){
            answer += min;
        }

        System.out.println(answer);
    }

}
