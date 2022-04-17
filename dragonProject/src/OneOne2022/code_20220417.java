package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220417 {

/**
5
2 1 2 3 4
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int base = Integer.parseInt(st.nextToken());
        int[] arr = new int[n-1];
        boolean checked =  true;

        for(int i=0; i<n-1; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i=0; i<n-1; i++){
            if(base > arr[i]){
                base += arr[i];
            }else if(base == arr[i]){

            }else{
                checked = false;
                break;
            }
        }

        if(checked) System.out.println("Yes");
        else System.out.println("No");

    }
}
