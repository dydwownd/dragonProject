package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220514 {

/**
5 7
8 1 2 5 9
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String binaryK = Integer.toBinaryString(K);
        int[] arr = new int[N];
        int start = -1;
        int end = -1;

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++){
            if(arr[i] > K){
                continue;
            }else{
                int temp = arr[i];
                boolean checked = false;
                for(int j=i+1; j<N; j++){
                    temp = temp | arr[j];
                    if(temp > K) break;
                    if(binaryK.equals(Integer.toBinaryString(temp))){
                        start = i+1;
                        end = j+1;
                        checked = true;
                        break;
                    }
                }
                if(checked) break;
            }
        }

        if(start == -1) System.out.print(-1);
        else System.out.print(start + " " + end);
    }
}
