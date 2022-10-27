package OneOne2022;
import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class code_20221027 {
//1114

/**
9 2 1
4 5
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        long L = Long.parseLong(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        List<Long> list = new ArrayList<>();
        list.add((long)0);
        list.add(L);

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<K; i++) list.add(Long.parseLong(st.nextToken()));

        Collections.sort(list,(o1, o2) -> (int)(o1-o2));

        long left = 0;
        long right = L;
        long ansFirst = 0;
        long ansLongest = L;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long cutCnt = 0;
            long firstCut = -1;
            long diff = 0;
            for (int i = K; i >= 0; i--) {
                diff += list.get(i + 1) - list.get(i);
                if (diff > mid) {
                    diff = list.get(i + 1) - list.get(i);
                    cutCnt++;
                    if (diff > mid) {
                        cutCnt = C + 1;
                        break;
                    }
                }
            }
            if (cutCnt < C) {
                firstCut = list.get(1);
            } else {
                firstCut = diff;
            }
            if (cutCnt <= C) {
                ansLongest = Math.min(mid, ansLongest);
                ansFirst = firstCut;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        bw.write(ansLongest + " " + ansFirst + "\n");
        bw.close();
        br.close();
    }
}
