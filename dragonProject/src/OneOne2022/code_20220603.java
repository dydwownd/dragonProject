package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code_20220603 {

/**
2
0
900
8
1400
1200
1000
800
600
400
200
0
0
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;

            int[] arr= new int[n];
            boolean checked = true;

            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(arr);

            for(int i=0; i<n-1; i++){
                if(arr[i]+200 < arr[i+1]){
                    checked = false;
                    break;
                }
            }
            if(checked) System.out.println("POSSIBLE");
            else System.out.println("IMPOSSIBLE");
        }

    }
}
