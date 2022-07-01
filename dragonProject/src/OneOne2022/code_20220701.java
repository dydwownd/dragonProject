package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code_20220701 {
//2871
/**
8
cokolada
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        boolean[] checked = new boolean[N];
        int[][] arr = new int[N][2];
        int maxIdx = N-1;
        int minIdx = 0;

        StringBuilder sg = new StringBuilder();
        StringBuilder hw = new StringBuilder();

        for(int i=0; i<N; i++){
            arr[i][0] = i;
            arr[i][1] = (int)str.charAt(i);
        }

        Arrays.sort(arr,(o1, o2) -> o1[1]-o2[1]);

        boolean added = true;
        while(added){
            added = false;
            for(int i=maxIdx; i>=0; i--){
                if(!checked[i]){
                    sg.append(str.charAt(i));
                    checked[i] = true;
                    maxIdx = i-1;
                    added = true;
                    break;
                }
            }

            for(int i=minIdx; i<N; i++){
                if(!checked[arr[i][0]]){
                    hw.append((char)arr[i][1]);
                    checked[arr[i][0]] = true;
                    minIdx = i+1;
                    added = true;
                    break;
                }
            }
        }

        if(sg.toString().compareTo(hw.toString())>0) System.out.println("DA");
        else System.out.println("NE");

        System.out.println(hw.toString());

    }
}
