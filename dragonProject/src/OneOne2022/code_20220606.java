package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220606 {

/**
aabb
ab
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String target = br.readLine();
        boolean[] visited = new boolean[str.length()];
        int answer = 0;
        boolean checked = false;

        do{
            checked = false;
            int idx = 0;
            int cnt = 0;

            for(int i=0; i<target.length(); i++){
                while(str.indexOf(target.substring(i,i+1),idx) >= 0){
                    idx = str.indexOf(target.substring(i,i+1),idx);
                    if(!visited[idx]){
                        visited[idx] = true;
                        cnt++;
                        break;
                    }
                    idx++;
                }
            }
            if(cnt == target.length()){
                checked = true;
                answer++;
            }

        }while(checked);

        System.out.print(answer);
    }
}
