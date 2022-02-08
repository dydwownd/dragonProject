package OneOne2022;
import java.util.*;

public class code_20220208 {

/**
5 1
3
1
5
3
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int J = sc.nextInt();

        int left = 1;
        int right = M;
        int answer = 0;

        for(int i=0; i<J; i++){
            int apple = sc.nextInt();

            if(apple > right){
                answer += apple-right;
                left += apple-right;
                right = apple;
            }else if(apple < left){
                answer += left-apple;
                right -= left-apple;
                left = apple;
            }
        }

        System.out.println(answer);

    }

}
