package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220615 {

/**
2 2 1 2 2
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        int answer = 0;

        for(int i=0; i<5; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int min = Math.min(arr[0], Math.min(arr[2],arr[4]));
        answer += min;
        arr[0] -= min;
        arr[2] -= min;
        arr[4] -= min;
        boolean checked = true;

        while(checked){
            checked = false;
            if(arr[0] == 0 && arr[1] == 0) break;
            if(arr[2] == 0 && arr[1] == 0 && arr[3] == 0) break;
            if(arr[3] == 0 && arr[4] == 0) break;

            if(arr[0] ==0){
                arr[0]++;
                arr[1]--;
            }

            if(arr[4] ==0){
                arr[4]++;
                arr[3]--;
            }

            if(arr[2]==0){
                if(arr[0]+arr[1] > arr[3]+arr[4]){
                    if(arr[1]>0){
                        arr[1]--;
                    }else if(arr[3]>0){
                        arr[3]--;
                    }
                }else{
                    if(arr[3]>0){
                        arr[3]--;
                    }else if(arr[1]>0){
                        arr[1]--;
                    }
                }
                arr[2]++;
            }

            if(arr[0] > 0 && arr[2] > 0 && arr[4] > 0){
                checked = true;
                answer++;
                arr[0]--;
                arr[2]--;
                arr[4]--;
            }
        }

        System.out.println(answer);
    }
}
