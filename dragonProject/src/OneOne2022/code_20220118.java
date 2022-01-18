package OneOne2022;
public class code_20220118 {

    public static void main(String[] args) {
        int n = 437674;
        int k = 3;
        System.out.println(solution(n,k));
    }

    public static int solution(int n, int k) {
        int answer = 0;
        
        String str = result(n,k);
        
        String[] spt = str.split("0");
        
        for(int i=0; i<spt.length; i++){
            if(spt[i] != null && spt[i].length()>0){
                if(isPrime(spt[i])) answer++;
            }
        }
        
        return answer;
    }

    private static boolean isPrime(String s) {
        int num = Integer.parseInt(s);
        if(num == 1) return false;
        if(num == 2) return true;

        for(int i=3; i<Math.sqrt(num); i++){
            if(num%i == 0) return false;
        }

        return true;
    }

    private static String result(int n, int k) {
        StringBuilder sb = new StringBuilder();
        
        while(n>0){
            sb.append(n%k);
            n /= k;
        }
        
        return sb.reverse().toString();
    }

}
