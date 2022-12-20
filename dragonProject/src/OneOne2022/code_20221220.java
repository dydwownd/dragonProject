package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class code_20221220 {
//25631

/**
3
1 2 3
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            int temp = Integer.parseInt(st.nextToken());
            map.put(temp,map.getOrDefault(temp,0)+1);
        }

        for(int i : map.keySet()){
            answer = Math.max(answer,map.get(i));
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
