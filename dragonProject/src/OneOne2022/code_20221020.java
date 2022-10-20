package OneOne2022;
import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class code_20221020 {
//2513

/**
3 4 4
0 1
2 2
5 1
*/

    public static class Bus{
        int idx;
        int cnt;
        Bus(int i, int c){
            idx = i;
            cnt = c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int school = Integer.parseInt(st.nextToken());
        List<Bus> min = new ArrayList<>();
        List<Bus> max = new ArrayList<>();
        int answer = 0;
        int add = 0;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            int idx = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken());

            if(idx < school) min.add(new Bus(idx,cnt));
            else max.add(new Bus(idx,cnt));
        }

        Collections.sort(min,(o1, o2) -> o1.idx-o2.idx);
        Collections.sort(max,(o1, o2) -> o2.idx-o1.idx);

        for(int i=0; i<min.size(); i++){
            if(add >= min.get(i).cnt){
                add -= min.get(i).cnt;
            }else{
                if(add > 0){
                    min.get(i).cnt -= add;
                    add = 0;
                }

                int temp = (Math.abs(min.get(i).idx - school)*2);
                int calc = 0;

                calc = min.get(i).cnt/k;

                if(min.get(i).cnt % k != 0){
                    calc++;
                    add = (k - (min.get(i).cnt % k));
                }

                temp *= calc;

                answer += temp;
            }

        }

        add = 0;

        for(int i=0; i<max.size(); i++){
            if(add >= max.get(i).cnt){
                add -= max.get(i).cnt;
            }else{
                if(add > 0){
                    max.get(i).cnt -= add;
                    add = 0;
                }

                int temp = (Math.abs(max.get(i).idx - school)*2);
                int calc = 0;

                calc = max.get(i).cnt/k;

                if(max.get(i).cnt % k != 0){
                    calc++;
                    add = (k - (max.get(i).cnt % k));
                }

                temp *= calc;

                answer += temp;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
