package OneOne2022;
import java.util.Scanner;

public class code_20220317 {

/**
4
5 4 5 5
1 5 0 1
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] now = new int[n];
        int[] target = new int[n];
        int[] highLow = new int[n];
        int answer = 0;

        for(int i=0; i<n; i++){
            now[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            target[i] = sc.nextInt();
            if(now[i] < target[i]) highLow[i] = 1;
            else if(now[i] > target[i]) highLow[i] = -1;
        }

        int i=0;
        while(i<n){
            if(now[i] != target[i]){
                for(int j=i; j<n; j++){
                    if(highLow[i] != highLow[j]) break;
                    if(now[j] == target[j]) break;
                    now[j] += highLow[i];
                }
                answer++;
            }else{
                i++;
            }
        }


        System.out.println(answer);

    }

}
