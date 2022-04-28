package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220428 {

/**
5
100
234
430
120
489
*/

    static int[] arr;
    static double answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        answer = 0;

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        nCr(n,3,new boolean[n],0);

        System.out.println(String.format("%.0f",answer));
    }

    private static void nCr(int n, int r, boolean[] visited, int idx) {
        if(r==0) {
            answer = Math.max(answer, calc(n,visited));
        }else {
            for(int i=idx; i<n; i++) {
                visited[i] = true;
                nCr(n,r-1,visited,i+1);
                visited[i] = false;
            }
        }
    }

    private static double calc(int n,boolean[] visited) {
        List<Integer> list = new ArrayList<>();
        double result = 0;

        for(int i=0; i<n; i++){
            if(visited[i]){
                list.add(arr[i]);
                result += arr[i];
            }
        }
        result /= 3;
        Collections.sort(list);

        result = Math.abs(result-list.get(1));
        result *= 3;

        return result;
    }

}
