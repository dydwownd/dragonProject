package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220524 {

/**
9
1
2
5
4
3
3
6
6
2
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        int[] arr = new int[N];
        int power = 0;
        boolean bomb = false;

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        if(N==1) System.out.print(1);
        else{
            for(int i=0; i<N+1; i++){
                if(bomb){
                    if(power<=arr[i]){
                        answer++;
                        power = arr[i];
                    }
                }else{
                    if(arr[i] >= arr[i+1]) {
                        answer++;
                        bomb = true;
                        power = arr[i+1];
                    }
                }
            }
        }
        if(answer == 0) answer++;

        System.out.println(answer);
    }
}
