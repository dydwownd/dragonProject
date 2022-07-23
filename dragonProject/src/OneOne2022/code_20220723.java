package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code_20220723 {
//10162
/**
100
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] time = new int[]{300,60,10};
        int[] arr = new int[3];

        for(int i=0; i<3; i++){
            arr[i] = n/time[i];
            n %= time[i];
        }

        if(n>0) System.out.println(-1);
        else Arrays.stream(arr).forEach(x->System.out.print(x+" "));
    }
}
