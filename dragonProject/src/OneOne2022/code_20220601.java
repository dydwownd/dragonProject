package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220601 {

/**
15
JJOIIOOJOJIOIIO
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] arr = new int[N];//J O I
        int answer = 0;

        for(char c : str.toCharArray()){
            if(c == 'J') arr[0]++;
            else if(c == 'O')  arr[1]++;
            else arr[2]++;
        }

        int joiCnt = Math.min(arr[0], Math.min(arr[1],arr[2]));
        answer += joiCnt;
        arr[0] -= joiCnt;
        arr[1] -= joiCnt;
        arr[2] -= joiCnt;
        int ioiCnt = 0;
        if(arr[1]*2 <= arr[2]) ioiCnt = arr[1];
        else if(arr[2]/2 <= arr[1]) ioiCnt = arr[2]/2;

        answer += ioiCnt;

        System.out.print(answer);
    }
}
