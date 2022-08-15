package OneOne2022;
import java.io.*;

public class code_20220816 {
//10775
/**
4
3
4
1
1
*/

    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int gate = Integer.parseInt(br.readLine());
        int plane = Integer.parseInt(br.readLine());
        parent = new int[gate+1];
        int answer = 0;

        for(int i=0; i<gate+1; i++) parent[i] = i;

        for(int i=0; i<plane; i++){
            int result = find(Integer.parseInt(br.readLine()));

            if(result == 0) break;

            union(result,result-1);
            answer++;
        }

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int find(int x){
        if(parent[x] == x) return x;
        else return find(parent[x]);
    }

    public static void union(int x, int y){
        x = find(x);
        y = find(y);

        if(x!=y) parent[x] = y;
    }
}
