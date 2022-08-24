package OneOne2022;
import java.io.*;
import java.util.*;

public class code_20220824 {
//1092
/**
3
6 8 9
5
2 5 2 4 7
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] crane = new int[n];

        for(int i=0; i<n; i++) crane[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(crane);

        int box = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        List<Integer> job = new ArrayList<>();

        for(int i=0; i<box; i++) job.add(Integer.parseInt(st.nextToken()));

        Collections.sort(job,(o1, o2) -> o2-o1);

        int answer = 0;

        if(crane[n-1] < job.get(0)) answer = -1;
        else{
            while(!job.isEmpty()){
                int idx = 0;
                for(int i=n-1; i>=0; ){
                    if(idx >= job.size()) break;
                    if(crane[i] >= job.get(idx)){
                        job.remove(idx);
                        i--;
                    }else{
                        idx++;
                    }
                }
                answer++;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
