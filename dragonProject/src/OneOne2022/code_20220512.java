package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220512 {

/**
3
1
5
10
*/

    static int[] arr;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        int answer = 0;

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        if(arr[0] < arr[1]){
            answer += arr[1]-arr[0];
            arr[0] = arr[1];
        }

        if(arr[n-2] > arr[n-1]) {
            answer += arr[n-2]-arr[n-1];
            arr[n-1] = arr[n-2];
        }

        boolean checked = false;

        do{
            boolean complete = true;
            for(int i=1; i<n; i++){
                if(arr[0] != arr[i]){
                    complete = false;
                    break;
                }
            }

            if(complete) break;

            for(int i=1; i<n-1; i++){
                if(arr[i] != arr[i-1] || arr[i] != arr[i+1]){
                    add(arr[i],i);
                    answer++;
                    checked = true;
                }
            }

        }while(checked);


        System.out.print(answer);

    }

    private static void add(int num, int idx) {
        arr[idx]++;
        for(int i=idx+1; i<n; i++){
            if(arr[i] == num) arr[i]++;
            else break;
        }

        for(int i=idx-1; i>=0; i--){
            if(arr[i] == num) arr[i]++;
            else break;
        }
    }
}
