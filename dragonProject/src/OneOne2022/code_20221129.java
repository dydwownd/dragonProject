package OneOne2022;
import java.io.*;
import java.util.*;

public class code_20221129 {
//6137

/**
6
A
C
D
B
C
B
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Character> word = new ArrayList<>();
        List<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) word.add(br.readLine().charAt(0));

        int front = 0;
        int end = n-1;
        while(front <= end) {
            if (word.get(front)<word.get(end)) list.add(word.get(front++));
            else if (word.get(front)>word.get(end)) list.add(word.get(end--));
            else {
                int tempF = front+1;
                int tempE = end-1;
                int size = list.size();
                while(tempF <= tempE) {
                    if (word.get(tempF) < word.get(tempE)) {
                        list.add(word.get(front++));
                        break;
                    }else if (word.get(tempF)>word.get(tempE)) {
                        list.add(word.get(end--));
                        break;
                    }else{
                        tempF++;
                        tempE--;
                    }
                }
                if (size==list.size()) list.add(word.get(front++));
            }
        }

        for(int i=0; i<list.size(); i++){
            if(i != 0 && i%80==0) sb.append("\n");
            sb.append(list.get(i));
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
