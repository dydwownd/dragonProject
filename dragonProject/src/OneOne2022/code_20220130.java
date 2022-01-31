package OneOne2022;
import java.util.*;

public class code_20220130 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        2 7
        2 3 2 3 1 2 7
        */
        int N = sc.nextInt();
        int K = sc.nextInt();

        int cnt = 0;
        int result = 0;
        boolean[] visited = new boolean[101];
        int[] use = new int[K];
        List<Integer> list;

        for(int i=0; i<K; i++){
            use[i] = sc.nextInt();
        }

        for(int i=0; i<K; i++){
            if(cnt < N){
                cnt++;
                visited[use[i]] = true;
            }else{
                if(visited[use[i]]) continue;
                else{
                    list = new ArrayList<>();
                    for(int j=i+1; j<K; j++){
                        if(!visited[use[j]] && !list.contains(use[j])) list.add(use[j]);
                    }
                    if(list.size() == 0){
                        for(int j=0; j<i; j++){
                            if(visited[use[j]]){
                                visited[use[j]] = false;
                                break;
                            }
                        }
                    }else{
                        visited[list.get(list.size()-1)] =false;
                    }
                    visited[use[i]] = true;
                    result++;
                }

            }
        }

        System.out.println(result);

    }

}
