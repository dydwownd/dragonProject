package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220412 {

/**
YNYNYNYNY
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int n = str.length();
        char[] arr = new char[n];
        int answer = 0;
        boolean check = true;

        for(int i=0; i<n; i++){
            arr[i] = str.charAt(i);
        }

        for(int i=0; i<n; i++){
            if(arr[i] == 'Y'){
                answer++;
                if(i==0){
                    for(int j=0; j<n; j++){
                        if(arr[j] == 'Y') arr[j] = 'N';
                        else arr[j] = 'Y';
                    }
                }else{
                    for(int j=i+1; j<n; j+=(i+1)){
                        if(arr[j-1] == 'Y') arr[j-1] = 'N';
                        else arr[j-1] = 'Y';
                    }
                }
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i] == 'Y'){
                check = false;
                break;
            }
        }

        if(check) System.out.println(answer);
        else System.out.println(-1);

    }

}
