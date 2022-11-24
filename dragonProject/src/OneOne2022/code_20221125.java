package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221125 {
//2450

/**
8
1 3 3 2 1 1 3 2
*/

    static int n;
    static int answer;
    static int[] arr;
    static int[] brr;
    static int[] cnt;
    static int[] order;
    static int[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        arr = new int[100005];
        brr = new int[100005];
        answer = Integer.MAX_VALUE;
        cnt = new int[4];
        order = new int[4];
        check = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            cnt[arr[i]]++;
        }

        DFS(1);

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }

    private static void DFS(int step) {
        if (step > 3) {
            answer = Math.min(answer, calc());
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if (check[i] == 1) continue;
            check[i] = 1;
            order[step] = i;
            DFS(step + 1);
            check[i] = 0;
        }
    }

    private static int calc() {
        int i = 0;
        int j = 0;
        int k = 0;
        int[][] pos = new int[4][4];
        int cnt1 = 0;
        int cnt2 = 0;

        for (i=1; i<=3; i++) {
            for (j=0; j<cnt[order[i]]; j++) {
                brr[k++] = order[i];
            }
        }

        for (i=0; i<n; i++) {
            pos[brr[i]][arr[i]]++;
        }

        for (i=1; i<3; i++) {
            for (j=i+1; j<=3; j++) {
                k = Math.min(pos[i][j], pos[j][i]);
                cnt1 += k;
                cnt2 += pos[i][j] + pos[j][i] - (k * 2);
            }
        }
        return cnt1 + cnt2 / 3 * 2;
    }
}
