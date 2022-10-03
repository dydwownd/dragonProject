package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221003 {
//1082

/**
3
6 7 8
21
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int m = Integer.parseInt(br.readLine());
        int[] room = new int[n];
        StringBuilder sb = new StringBuilder();
        int min = 50;
        int idx = -1;
        char[] num = new char[51];
        int cnt = 0;
        int startIdx = 0;

        for(int i=0; i<n; i++){
            room[i] = Integer.parseInt(st.nextToken());
            if(min >= room[i]){
                min = room[i];
                idx = i;
            }
        }

        cnt = m/min;
        m %= min;

        for(int i=0; i<cnt; i++){
            num[i] = (char)(idx+'0');
        }

        for(int i=0; i<cnt; i++){
            for(int j=n-1; j>=0; j--){
                if(room[j] <= m + min){
                    num[i] = (char) (j+'0');
                    m += (min - num[j]);
                    break;
                }
            }
            if(num[startIdx] == '0'){
                startIdx++;
                m += min;
            }
        }

        if(startIdx == cnt){
            sb.append("0");
        }else{
            for(int i=startIdx; i<cnt; i++){
                sb.append(num[i]);
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
