package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220813 {
//1213
/**
ABACABA
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] arr = new int[26];
        StringBuilder front = new StringBuilder();
        StringBuilder tail = new StringBuilder();

        int oddCnt = 0;
        int oddIdx = 0;

        for(char c : str.toCharArray()){
            int idx = c-'A';
            arr[idx]++;
        }

        for(int i=0; i<26; i++){
            if(arr[i]%2 == 1){
                oddCnt++;
                oddIdx = i;
            }
        }

        if(oddCnt>1){
            System.out.println("I'm Sorry Hansoo");
        }else{
            for(int i=0; i<26; i++){
                if(arr[i]>0){
                    for(int j=0; j<arr[i]/2; j++) front.append((char)(i+65));
                }
            }
            tail.append(front.toString());

            if(oddCnt>0) front.append((char)(oddIdx+65));

            front.append(tail.reverse().toString());

            System.out.println(front.toString());
        }

    }
}
