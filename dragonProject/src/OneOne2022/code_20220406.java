package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220406 {

/**
5
3
0
1
1
0
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] n = new int[6];
        int[] remind = new int[6];

        for(int i=0; i<6; i++){
            n[i] = Integer.parseInt(br.readLine());
        }

        int answer = n[5];

        if(n[4] > 0){
            answer += n[4];
            remind[0] += n[4]*11;
        }

        if(n[3] > 0){
            answer += n[3];
            remind[1] += n[3]*5;
        }

        if(n[2] > 0){
            answer += n[2]/4;

            if(n[2]%4 != 0){
                answer++;
                remind[2] += 4-(n[2]%4);
            }
        }

        if(n[1] > 0){
            if(remind[2] > 0){
                if(n[1] > 5){
                    n[1] -= 5;
                    remind[0] += 8;
                }else{
                    if(n[1] == 5){
                        if(remind[2] == 3){
                            n[1] = 0;
                            remind[2] = 0;
                            remind[0] += 7;
                        }else if(remind[2] == 2){
                            n[1] = 2;
                            remind[2] = 0;
                            remind[0] += 6;
                        }else{
                            n[1] = 4;
                            remind[2] = 0;
                            remind[0] += 5;
                        }
                    }else if(n[1] == 4){
                        if(remind[2] == 3){
                            n[1] = 0;
                            remind[2] = 1;
                            remind[1] += 1;
                            remind[0] += 7;
                        }else if(remind[2] == 2){
                            n[1] = 1;
                            remind[2] = 0;
                            remind[0] += 6;
                        }else{
                            n[1] = 3;
                            remind[2] = 0;
                            remind[0] += 5;
                        }
                    }else if(n[1] == 3){
                        if(remind[2] == 3){
                            n[1] = 0;
                            remind[2] = 0;
                            remind[1] += 2;
                            remind[0] += 7;
                        }else if(remind[2] == 2){
                            n[1] = 0;
                            remind[2] = 0;
                            remind[0] += 6;
                        }else{
                            n[1] = 2;
                            remind[2] = 0;
                            remind[0] += 5;
                        }
                    }else if(n[1] == 2){
                        if(remind[2] == 3){
                            n[1] = 0;
                            remind[2] = 0;
                            remind[1] += 3;
                            remind[0] += 7;
                        }else if(remind[2] == 2){
                            n[1] = 0;
                            remind[2] = 0;
                            remind[1] += 1;
                            remind[0] += 6;
                        }else{
                            n[1] = 1;
                            remind[2] = 0;
                            remind[0] += 5;
                        }
                    }else if(n[1] == 1){
                        if(remind[2] == 3){
                            n[1] = 0;
                            remind[2] = 0;
                            remind[1] += 4;
                            remind[0] += 7;
                        }else if(remind[2] == 2){
                            n[1] = 0;
                            remind[2] = 0;
                            remind[1] += 2;
                            remind[0] += 6;
                        }else{
                            n[1] = 0;
                            remind[2] = 0;
                            remind[0] += 5;
                        }
                    }
                }
            }
            if(remind[1] > 0){
                if(n[1] > remind[1]){
                    n[1] -= remind[1];
                    remind[1] = 0;
                    answer += n[1]/9;
                    remind[0] += 36-(n[1]%9*4);
                }else{
                    remind[1] -= n[1];
                }
            }
        }

        if(n[0] > 0){
            int total = remind[2]*3 + remind[1]*2 + remind[0];
            if(n[0] > total){
                n[0] = n[0]-total;
                if(n[0]/36 == 0){
                    answer++;
                }else{
                    answer += n[0]/36;
                    if(n[0]%36 != 0) answer++;
                }
            }
        }

        System.out.println(answer);

    }

}
