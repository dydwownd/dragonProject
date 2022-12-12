package OneOne2022;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20221212 {
//2831

/**
1
-1800
1800
*/

    static int n;
    static int answer;
    static ArrayList<Integer>[] men;
    static ArrayList<Integer>[] women;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        men = new ArrayList[2];
        women = new ArrayList[2];
        StringTokenizer st;
        answer = 0;

        for(int i=0; i<2; i++) {
            men[i] = new ArrayList<Integer>();
            women[i] = new ArrayList<Integer>();
        }

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(temp < 0) men[0].add(temp*-1);
            else men[1].add(temp);
        }

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(temp < 0) women[1].add(temp*-1);
            else women[0].add(temp);
        }

        for(int i = 0; i < 2; i++) {
            Collections.sort(men[i]);
            Collections.sort(women[i]);
        }

        findPair(0);
        findPair(1);

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }

    static void findPair(int type) {
        for (int i=0, j=0; i < men[type].size() && j < women[type].size(); ) {
            int tall = type == 0 ? men[type].get(i) : women[type].get(j);
            int small = type == 0 ? women[type].get(j) : men[type].get(i);

            if (tall <= small) {
                if (type == 0)
                    i++;
                else
                    j++;
                continue;
            }

            answer++;
            i++;
            j++;
        }
    }
}
