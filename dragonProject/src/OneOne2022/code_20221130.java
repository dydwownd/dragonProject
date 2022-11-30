package OneOne2022;
import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20221130 {
//1150

/**
5 2
1
3
4
6
12
*/

    public static class Data implements Comparable<Data>{
        int val;
        int left;
        int right;

        Data(int v, int l, int r){
            val = v;
            left = l;
            right = r;
        }

    @Override
    public int compareTo(Data o) {
        return this.val-o.val;
    }
}

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(br.readLine());
        PriorityQueue<Data> q = new PriorityQueue<>();
        int answer = 0;

        Data[] point = new Data[n+1];

        for (int i=1; i<n; i++) {
            int temp = Integer.parseInt(br.readLine());
            point[i] = new Data(temp-p, i-1, i+1);
            q.offer(new Data(point[i].val , i, i + 1));
            p = temp;
        }

        point[n] = new Data(0, n - 1, n + 1 );

        for (int i = 0; i < k;) {
            Data t = q.poll();
            int cl = t.left;
            int cr = t.right;
            if (cl >= 1 && cr <= n && cr == point[cl].right && cl == point[cr].left) {
                answer += t.val;
                if (++i >= k) break;
                int nl = point[cl].left;
                int nr = point[cr].right;
                t.left = nl;
                t.right = nr;
                point[nl].val = point[nl].val + point[cr].val - t.val;
                t.val = point[nl].val;
                q.offer(t);
                point[nl].right = nr;
                point[nr].left = nl;

            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
