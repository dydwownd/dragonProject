package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220620 {

/**
3
2 10
3 1 2 3 100
4 4 5 6 7 200
2 3 1 4 5 2 2 1 3 4
3 6
2 1 2 100
3 3 4 5 200
1 6 300
1 2 3 4 5 6
3 6
2 1 2 100
3 3 4 5 200
1 6 300
1 2 0 4 5 6
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int testCase=0; testCase<T; testCase++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int answer = 0;

            List<Goods> list = new ArrayList<>();
            int[] arr = new int[m];

            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine()," ");
                int k = Integer.parseInt(st.nextToken());
                List<Integer> temp = new ArrayList<>();

                for(int j=0; j<k; j++){
                    temp.add(Integer.parseInt(st.nextToken())-1);
                }

                list.add(new Goods(temp,Integer.parseInt(st.nextToken())));
            }

            st = new StringTokenizer(br.readLine()," ");

            for(int i=0; i<m; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Collections.sort(list,(o1, o2) -> o2.price-o1.price);

            for(int i=0; i<n; i++){
                Goods now = list.get(i);
                int min = 100;
                for(int j : now.kind) min = Math.min(arr[j],min);

                for(int j : now.kind) arr[j] -= min;

                answer += (min*now.price);
            }

            sb.append(answer);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static class Goods{
        List<Integer> kind;
        int price;
        Goods(List<Integer> k, int p){
            kind = k;
            price = p;
        }
    }
}
