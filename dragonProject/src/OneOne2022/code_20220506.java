package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220506 {

/**
10 7
1 2
1 3
2 3
1 4
5 6
8 10
7 9
5 9 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<int[]> list = new ArrayList<>();

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int r = Integer.parseInt(st.nextToken())-1;
            int c = Integer.parseInt(st.nextToken())-1;
            list.add(new int[]{r,c});
        }

        st = new StringTokenizer(br.readLine(), " ");
        int C = Integer.parseInt(st.nextToken())-1;
        int H = Integer.parseInt(st.nextToken())-1;
        int K = Integer.parseInt(st.nextToken());
        int[] parent = new int[N];
        Integer[] cnt = new Integer[N];
        int answer = 0;

        for(int i=0; i<N; i++){
            parent[i] = i;
            cnt[i] = 0;
        }

        for(int i=0; i<M; i++){
            int[] temp = list.get(i);
            if(find(temp[0],parent) != find(temp[1],parent)){
                union(temp[0],temp[1],parent);
            }
        }

        for(int i=0; i<N; i++){
            if(parent[i] != find(C,parent) && parent[i] != find(H,parent)){
                cnt[parent[i]]++;
            }
            if(parent[i] == find(C,parent)){
                answer++;
            }
        }

        Arrays.sort(cnt,Collections.reverseOrder());

        for(int i=0; i<K; i++){
            answer += cnt[i];
        }

        System.out.print(answer);
    }

    public static int find(int x, int[] parent){
        if(x == parent[x]) return x;
        else return find(parent[x], parent);
    }

    public static void union(int x, int y, int[] parent){
        x = find(x,parent);
        y = find(y,parent);

        if(x>y){
            parent[x] = y;
        }else{
            parent[y] = x;
        }
    }
}
