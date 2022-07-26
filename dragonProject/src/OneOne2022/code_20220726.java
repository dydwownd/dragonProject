package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220726 {
//10610
/**
80875542
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int len = str.length();
        int[] arr = new int[10];
        StringBuilder sb = new StringBuilder();
        long sum = 0;

        for(int i=0; i<len; i++) {
            int temp = Integer.parseInt(str.substring(i, i + 1));
            arr[temp]++;
            sum += temp;
        }

        if(!str.contains("0") || sum%3 != 0) System.out.println(-1);
        else{
            for(int i=9; i>=0; i--){
                for(int j=0; j<arr[i]; j++){
                    sb.append(i);
                }
            }

            System.out.println(sb.toString());
        }
    }
}
