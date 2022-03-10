package OneOne2022;
import java.util.*;

public class code_20220310 {

/**
5
2 1 5 4 3
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] visited = new boolean[n];
        Map<Integer,Integer> map = new HashMap<>();
        int answer = n;

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            if(!map.isEmpty() && map.containsKey(num+1)){
                int idx = map.get(num+1);
                if(!visited[idx]){
                    visited[idx] = true;
                    answer--;
                }
            }
            map.put(num,i);
        }

        System.out.println(answer);
    }

}
