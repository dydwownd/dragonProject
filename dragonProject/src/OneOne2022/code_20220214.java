package OneOne2022;
import java.util.LinkedList;
import java.util.*;

public class code_20220214 {

/**
4
3
3
3
3
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long answer = 0;

        long[] tip = new long[n];

        for(int i=0; i<n; i++){
            tip[i] = sc.nextInt();
        }

        Arrays.sort(tip);

        for(int i=n-1; i>=0; i--){
            if(tip[i]+i-n+1 > 0) answer += (tip[i]+i-n+1);
        }

        System.out.println(answer);

    }

}
