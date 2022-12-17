package OneOne2022;
import java.io.*;

public class code_20221217 {
//18787

/**
7
GHHHGHH
HHGGGHH
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str1 = br.readLine();
        String str2 = br.readLine();
        int answer = 0;
        boolean flag = false;

        for(int i=0; i<n; i++){
            if(flag || str1.charAt(i) != str2.charAt(i)){
                flag = true;
            }
            if(flag && str1.charAt(i) == str2.charAt(i)){
                answer++;
                flag = false;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
