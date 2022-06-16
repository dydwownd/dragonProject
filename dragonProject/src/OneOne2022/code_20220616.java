package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.*;

public class code_20220616 {

/**
3
5
4 9 5 2 2 1 3 5 1 4
3
2 2 1 1 2 2
3
1 3 2 2 3 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int testcase = 0; testcase<T; testcase++){
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[][] arr = new int[N][2];
            Queue<Machine> q = new LinkedList<>();

            for(int i=0; i<N; i++){
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr,(o1, o2) -> o1[0]-o2[0]);

            for(int i=0; i<N; i++){
                if(q.isEmpty()){
                    q.offer(new Machine(arr[i][0],arr[i][1]));
                }else{
                    boolean checked = false;

                    for(int j=0; j<q.size(); j++){
                        Machine machine = q.poll();
                        if(machine.length < arr[i][0] && machine.weight < arr[i][1]){
                            checked = true;
                            q.offer(new Machine(arr[i][0],arr[i][1]));
                            break;
                        }
                        q.offer(machine);
                    }

                    if(!checked) q.offer(new Machine(arr[i][0],arr[i][1]));
                }
            }

            sb.append(q.size());
            sb.append("\n");
        }

        System.out.println(sb.toString());

    }

    public static class Machine{
        int length;
        int weight;
        Machine(int l, int w){
            length = l;
            weight = w;
        }
    }

}
