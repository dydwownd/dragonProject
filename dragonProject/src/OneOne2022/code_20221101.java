package OneOne2022;
import java.io.*;

public class code_20221101 {
//12933

/**
quqacukqauackck
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int answer = 0;
        boolean checked = true;

        if(str.length()%5 != 0){
            checked = false;
        }else{
            int[] arr = new int[6];//quack
            arr[0] = str.length();
            for(int i=0; i<str.length(); i++){
                int n = 0;
                if(str.charAt(i) == 'q') n = 1;
                if(str.charAt(i) == 'u') n = 2;
                if(str.charAt(i) == 'a') n = 3;
                if(str.charAt(i) == 'c') n = 4;
                if(str.charAt(i) == 'k') n = 5;

                if(arr[n-1] == 0){
                    checked = false;
                    break;
                }

                arr[n]++;
                arr[n-1]--;

                answer = Math.max(answer,arr[1]+arr[2]+arr[3]+arr[4]);

            }
        }

        bw.write(!checked?"-1":answer + "\n");
        bw.close();
        br.close();
    }
}
