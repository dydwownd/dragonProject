package OneOne2022;
import java.util.Scanner;

public class code_20220131 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int answer = 0;
        int max = 0;
        int killed = 0;

        for(int i=0; i<N; i++){
            int height = sc.nextInt();
            if(height > max){
                max = height;
                killed = 0;
            }else{
                killed++;
                answer = Math.max(answer,killed);
            }
        }

        System.out.println(answer);

    }

}
