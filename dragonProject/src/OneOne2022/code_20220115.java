package OneOne2022;
import java.util.Arrays;
import java.util.Collections;

public class code_20220115 {

    public static void main(String[] args) {
        int n = 12;
        int[] weak = {1, 5, 6, 10};
        int[] dist = {1,2,3,4};
        System.out.println(solution(n,weak,dist));
    }

    static int answer;
    static int[] Weak;
    static int[] Dist;

    public static int solution(int n, int[] weak, int[] dist) {
        answer = Integer.MAX_VALUE;
        Arrays.sort(weak);
        Weak = weak;
        Dist = Arrays.stream(dist).boxed().sorted(Collections.reverseOrder()).mapToInt(a->a).toArray();

        for(int i=0; i<weak.length; i++){
            baseCnt(i);
        }

        return answer;
    }

    private static void baseCnt(int idx) {
        int cnt = 0;
        boolean[] visited = new boolean[Weak.length];
        int next = (idx+1)%Weak.length;

        for(int i=0; i<Dist.length; i++){
            int dist = Weak[idx] + Dist[i];
        }

    }

}
