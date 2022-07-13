package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220713 {
//2205
/**
5
*/
    static double[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        arr = new double[20];
        visited = new boolean[100000];

        for(int i=0; i<20; i++) arr[i] = Math.pow(2,i+1);

        for(int i=1; i<=n; i++){
            sb.append(calc(i));
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    private static int calc(int num) {
        int result = 0;
        for(int i=0; i<20; i++){
            if(num < arr[i] && !visited[(int)arr[i]-num]){
                result = (int)arr[i]-num;
                visited[result] = true;
                break;
            }
        }
        return result;
    }
}
