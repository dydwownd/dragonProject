package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220812 {
//1700
/**
2 7
2 3 2 3 1 2 7
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] order = new int[k];
        boolean[] visited = new boolean[101];
        int answer = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<k; i++) order[i] = Integer.parseInt(st.nextToken());

        int cnt = 0;

        for(int i=0; i<k; i++){
            int now = order[i];
            if(cnt<n){
                if(!visited[now]){
                    visited[now] = true;
                    cnt++;
                }
            }else{

                if(!visited[now]){
                    ArrayList<Integer> target = new ArrayList<>();

                    for(int j=i; j<k; j++){
                        if(visited[order[j]] && !target.contains(order[j])){
                            target.add(order[j]);
                        }
                    }

                    if(target.size() == n){
                        int temp = target.get(target.size()-1);
                        visited[temp] = false;
                    }else{
                        for(int j=0; j<101; j++){
                            if(visited[j] && !target.contains(j)){
                                visited[j] = false;
                                break;
                            }
                        }
                    }

                    answer++;
                    visited[now] = true;
                }
            }
        }

        System.out.println(answer);
    }
}
