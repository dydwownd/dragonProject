package OneOne2022;
import java.util.Scanner;

public class code_20220129 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] games = new int[N];
        long result = 0;

        for(int i=0; i<N; i++){
            games[i] = sc.nextInt();
        }

        for(int i=N-1; i>0; i--){
            if(games[i-1] >= games[i]){
                result += (games[i-1] - games[i] + 1);
                games[i-1] = games[i]-1;
            }
        }

        System.out.println(result);
    }

}
