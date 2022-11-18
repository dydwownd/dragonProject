package OneOne2022;
import java.io.*;

public class code_20221118 {
//2697

/**
3
123
279134399742
987
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            String str = br.readLine();
            sb.append(solve(str));
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

    private static String solve(String s) {
        if (s.length() == 1)
            return "BIGGEST";

        int[] cnt = new int[10];

        int i = s.length()-2;
        for (; i >= 0; i--) {
            cnt[s.charAt(i+1)-'0']++;
            if (s.charAt(i) < s.charAt(i+1)) {
                cnt[s.charAt(i)-'0']++;
                break;
            }
        }

        if (i == -1)
            return "BIGGEST";

        StringBuilder answer = new StringBuilder();
        for (int j = 0; j < i; j++)
            answer.append(s.charAt(j));

        for (int j = (s.charAt(i)-'0')+1; j < cnt.length; j++) {
            if (cnt[j] == 0) continue;
            answer.append((char)('0'+j));
            cnt[j]--;
            break;
        }

        for (int j = 0; j < cnt.length; j++) {
            while (cnt[j]-->0) {
                answer.append((char)('0'+j));
            }
        }
        return answer.toString();
    }
}
