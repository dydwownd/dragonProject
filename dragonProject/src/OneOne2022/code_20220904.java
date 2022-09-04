package OneOne2022;
import java.io.*;
import java.util.PriorityQueue;
import java.util.*;

public class code_20220904 {
//2457

/**
4
1 1 5 31
1 1 6 30
5 15 8 31
6 10 12 10
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<>();
        int answer = 0;
        int min = 3001;
        int max = 0;
        int idx = 0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int startMon = Integer.parseInt(st.nextToken())*1000;
            int startDay = Integer.parseInt(st.nextToken());
            int endMon = Integer.parseInt(st.nextToken())*1000;
            int endDay = Integer.parseInt(st.nextToken());
            list.add(new int[]{startDay+startMon,endDay+endMon});
        }

        Collections.sort(list,(o1, o2) -> o1[0]==o2[0] ? o1[1]-o2[1] :o1[0]-o2[0]);

        while(min<12001){
            boolean checked = false;

            for(int i=idx; i<n; i++){
                if(list.get(i)[0] > min) break;
                if(list.get(i)[0] < min && list.get(i)[1] > max){
                    max = list.get(i)[1];
                    idx = i+1;
                    checked = true;
                }
            }

            if(checked){
                min = max;
                answer++;
            }else {
                break;
            }
        }

        if(max <= 11030) answer = 0;

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }

}
