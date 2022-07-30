package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220730 {
//1439
/**
11001100110011000001
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int len = str.length();
        StringBuilder sb = new StringBuilder();

        sb.append(str.charAt(0));

        for(int i=1; i<len; i++){
            if(str.charAt(i) != str.charAt(i-1)) sb.append(str.charAt(i));
        }

        int[] arr = new int[2];
        String temp = sb.toString();

        for(int i=0; i<temp.length(); i++){
            if(temp.charAt(i) == '0') arr[0]++;
            else arr[1]++;
        }

        System.out.println(Math.min(arr[0],arr[1]));
    }
}
