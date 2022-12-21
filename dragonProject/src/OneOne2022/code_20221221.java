package OneOne2022;
import java.io.*;

public class code_20221221 {
//2930

/**
4
SPRS
4
RPRP
SRRR
SSPR
PSPS
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] data = br.readLine().toCharArray();
        int[] me = getResult(data);
        int myScore = 0;
        int maxScore = 0;

        int t = Integer.parseInt(br.readLine());

        for(int k=0; k<t; k++){
            char[] round = br.readLine().toCharArray();
            int[] ex = getResult(round);
            int score = 0;

            for(int i=0; i<n; i++){
                if(data[i] == round[i]) score++;
                else{
                    if(data[i] == 'S' && round[i] == 'P') score += 2;
                    else if(data[i] == 'P' && round[i] == 'R') score += 2;
                    else if(data[i] == 'R' && round[i] == 'S') score += 2;
                }
            }
            myScore += score;

            score = 0;
            int min = 0;
            if(me[0] > 0 && ex[1] > 0){
                min = Math.min(me[0],ex[1]);
                score += (2*min);
                me[0] -= min;
                ex[1] -= min;
            }
            if(me[1] > 0 && ex[2] > 0){
                min = Math.min(me[1],ex[2]);
                score += (2*min);
                me[1] -= min;
                ex[2] -= min;
            }
            if(me[2] > 0 && ex[0] > 0){
                min = Math.min(me[2],ex[0]);
                score += (2*min);
                me[2] -= min;
                ex[0] -= min;
            }
            if(me[0] > 0 && ex[0] > 0){
                min = Math.min(me[0],ex[0]);
                score += min;
                me[0] -= min;
                ex[0] -= min;
            }
            if(me[1] > 0 && ex[1] > 0){
                min = Math.min(me[1],ex[1]);
                score += min;
                me[1] -= min;
                ex[1] -= min;
            }
            if(me[2] > 0 && ex[2] > 0){
                min = Math.min(me[2],ex[2]);
                score += min;
                me[2] -= min;
                ex[2] -= min;
            }
            maxScore += score;
        }

        bw.write(myScore + "\n");
        bw.write(maxScore + "\n");
        bw.close();
        br.close();
    }

    private static int[] getResult(char[] data) {
        int[] temp = new int[3];

        for(int i=0; i<data.length; i++){
            if('S' == data[i]) temp[0]++;
            else if('P' == data[i]) temp[1]++;
            else temp[2]++;
        }

        return temp;
    }
}
