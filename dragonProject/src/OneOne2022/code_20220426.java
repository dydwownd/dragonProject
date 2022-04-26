package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220426 {

/**
2
10
26
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            int[] arr = new int[4];//2,3,5,7
            int[] num = {2,3,5,7};
            long answer = 0;
            boolean checked = true;

            int n = Integer.parseInt(br.readLine());

            while(n>1){
                if(n%2 != 0 && n%3 != 0 && n%5 != 0 && n%7 != 0 && n>10){
                    checked = false;
                    break;
                }else if(n%2 == 0){
                    n /= 2;
                    arr[0]++;
                }else if(n%3 == 0){
                    n /= 3;
                    arr[1]++;
                }else if(n%5 == 0){
                    n /= 5;
                    arr[2]++;
                }else if(n%7 == 0){
                    n /= 7;
                    arr[3]++;
                }
            }

            for(int j=0; j<4; j++){
                if(arr[j] != 0){
                    answer += String.valueOf(Math.pow(num[j],arr[j])).length()-2;
                }
            }

            if(checked) System.out.println(answer);
            else System.out.println("-1");
        }

    }
}
