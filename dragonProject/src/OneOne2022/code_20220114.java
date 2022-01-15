package OneOne2022;
import java.util.*;

public class code_20220114 {

    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        Arrays.stream(solution(tickets)).forEach(System.out::println);
    }

    public static class Node{
        String from;
        String to;
        Node(String f, String t){
            from = f;
            to = t;
        }
    }

    public static String[] solution(String[][] tickets) {
        String[] answer = {};
        Stack<String> stack = new Stack<>();
        stack.push("ICN");
        Arrays.sort(tickets,(o1, o2) -> (o1[0]+o1[1]).compareTo(o2[0]+o2[1]));
        Queue<Node> q = new LinkedList<>();

        for(int i=0; i<tickets.length; i++){
            q.offer(new Node(tickets[i][0],tickets[i][1]));
        }

        while(!q.isEmpty()){
            Node now = q.poll();
            if(stack.peek().equals(now.from)){
                stack.push(now.to);
            }else{
                q.offer(now);
            }
        }

        answer = new String[stack.size()];

        for(int i=0; i<stack.size(); i++){
            answer[i] = stack.elementAt(i);
        }

        return answer;
    }

}
