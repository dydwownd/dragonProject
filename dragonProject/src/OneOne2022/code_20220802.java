package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;

public class code_20220802 {
//1202
/**
2 1
5 10
100 100
11
*/

    public static class Jewel{
        int weight;
        int price;

        Jewel(int w, int p){
            weight = w;
            price = p;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Jewel> list = new ArrayList<>();

        int[] bag = new int[k];
        long answer = 0;
        int listIdx = 0;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            list.add(new Jewel(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }

        for(int i=0; i<k; i++){
            bag[i] = Integer.parseInt(br.readLine());
        }

        Collections.sort(list,(o1, o2) -> o1.weight-o2.weight);

        Arrays.sort(bag);

        PriorityQueue<Jewel> q = new PriorityQueue<>((o1, o2) -> o2.price-o1.price);

        for(int i=0; i<k; i++){
            while(listIdx<n && list.get(listIdx).weight <= bag[i]){
                q.offer(list.get(listIdx));
                listIdx++;
            }

            if(!q.isEmpty()) answer += q.poll().price;

        }

        System.out.println(answer);
    }
}
