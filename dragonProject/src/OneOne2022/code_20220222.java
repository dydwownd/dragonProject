package OneOne2022;
import java.util.*;

public class code_20220222 {

/**
5 3
1 3 5 6 10
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        Integer[] arr = new Integer[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int result1 = solve(arr,N,K);

        Arrays.sort(arr, Collections.reverseOrder());

        int result2 = solve(arr,N,K);

        int answer = Math.min(result1,result2);

        System.out.println(answer);
    }

    private static int solve(Integer[] arr, int n, int k) {
        int val = n/k-1;
        int re = n%k;
        int result = 0;
        int idx = 0;

        while(idx < arr.length){
            int min = arr[idx];
            idx += val;
            if(idx >= arr.length) break;
            int max = arr[idx];
            if(re >= 0){
                idx++;
                if(idx >= arr.length) break;
                re--;
                max = arr[idx];
            }
            idx++;
            result += Math.abs(min-max);
        }

        return result;
    }

}
