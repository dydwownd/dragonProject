package OneOne2022;
import java.util.Arrays;

public class code_20220120 {

    public static void main(String[] args) {
        int n = 5;
        int[] info = {2,1,1,1,0,0,0,0,0,0,0};
        Arrays.stream(solution(n,info)).forEach(System.out::println);
    }

    public static int[] solution(int n, int[] info) {
        int[] answer = {-1};
        int[] myP = new int[11];
        int cnt = n;
        int max = 0;
        int ryon = 0;
        int apeach = 0;

        for(int i=0; i<info.length; i++){
            cnt = n;
            ryon = 0;
            apeach = 0;
            myP = new int[11];

            for(int j=i-1; j>=0; j--){
                if(info[j] > 0) apeach += 10-j;
            }

            for(int j=i; j<info.length; j++){
                if(info[j] < cnt){
                    myP[j] = info[j]+1;
                    cnt -= myP[j];
                    ryon += 10-j;
                }else if(info[j] > 0){
                    apeach += 10-j;
                }
            }

            if(cnt > 0) myP[10] = cnt;

            if(ryon-apeach>max){
                max = ryon-apeach;
                answer = myP;
            }
        }

        return answer;
    }

}
