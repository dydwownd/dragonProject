package OneOne2022;
import java.io.*;

public class code_20221207 {
//2464

/**
43
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        long answer1 = 0;
        long answer2 = 0;

        int myCnt = 0;
        int sCnt = 0;
        answer1 = n;
        answer2 = n;
        myCnt = countOne(n);
        while(myCnt != sCnt)
        {
            answer1++;
            sCnt = countOne(answer1);
        }
        sCnt = 0;
        while (myCnt != sCnt)
        {
            answer2--;
            if (answer2 <= 0)
            {
                answer2 = 0;
                break;
            }
            sCnt = countOne(answer2);
        }

        bw.write(answer2 + " " +answer1 + "\n");
        bw.close();
        br.close();
    }

    public static int countOne(long num)
    {
        long[] arr = new long[70];
        int i = 69;
        int cnt = 0;
        while (num != 0) {
            arr[i] = num % 2;
            if (arr[i] == 1)
                cnt++;
            num /= 2;
            i--;
        }
        return cnt;
    }

}
