package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221225 {
//3090

/**
5 2
3 2 3 2 2
*/

    static int n;
    static int t;
    static int[] arr;
    static int[] copyArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        arr = new int[n];
        copyArr = new int[n];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int left = 0;
        int right = Integer.MAX_VALUE;
        while (left < right) {
            int mid = (left + right) / 2;
            if (isPossible(mid))
                right = mid;
            else
                left = mid + 1;
        }

        printAnsArr(right);

        for (int i=0; i<n; i++) sb.append(arr[i] + " ");

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

    static boolean isPossible(int mid) {
        long oprCnt = 0;
        for (int i=0; i<n; i++)
            copyArr[i] = arr[i];

        for (int i=0; i<n-1; i++) {
            if (copyArr[i+1] - copyArr[i] > mid) {
                oprCnt += copyArr[i+1] - (copyArr[i] + mid);
                copyArr[i+1] = copyArr[i] + mid;
            }
        }

        for (int i=n-1; i>0; i--) {
            if (copyArr[i-1] - copyArr[i] > mid) {
                oprCnt += copyArr[i-1] - (copyArr[i] + mid);
                copyArr[i-1] = copyArr[i] + mid;
            }
        }

        return oprCnt <= 1 ? true : false;
    }

    static void printAnsArr(int mid) {
        for (int i=0; i<n-1; i++)
            if (arr[i+1] - arr[i] > mid)
                arr[i+1] = arr[i] + mid;

        for (int i=n-1; i>0; i--)
            if (arr[i-1] - arr[i] > mid)
                arr[i-1] = arr[i] + mid;


    }
}
