package Study;

import java.util.*;

public class MaxNumber {

	public static void main(String[] args) {
		int[] num = {0,0,0,0};
		
		String answer = solution(num);
		
		System.out.println(answer);
	}
		
	public static class NumBer{
		String str = "";
		NumBer(String s){
			str = s;
		}		
	}
	
	static Comparator<NumBer> comp = new Comparator<NumBer>(){
		public int compare(NumBer a, NumBer b){
			return (b.str+a.str).compareTo(a.str+b.str);
		}
	};
	
	static List<NumBer> list = new ArrayList<NumBer>();
    
    public static String solution(int[] numbers) {
        int len = numbers.length;
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i<len; i++){
        	list.add(new NumBer(String.valueOf(numbers[i])));
        }
        
        Collections.sort(list,comp);
        
        for(int i=0; i<list.size(); i++){
        	if("0".equals(list.get(0).str)){
        		str.append(0);
        		break;
        	}
        	str.append(list.get(i).str);
        }
        
        return str.toString();
    }
    
}
