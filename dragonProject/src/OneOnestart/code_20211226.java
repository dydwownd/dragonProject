package OneOnestart;

import java.util.*;

//금과 은 운반하기
public class code_20211226 {

	public static void main(String[] args) {
		int a = 90;
		int b = 500;
		int[] g = {70,70,0};//금
		int[] s = {0,0,500};//은
		int[] w = {100,100,2};//최대 싣는무게
		int[] t = {4,8,1};//드는시간
		System.out.println(solution(a,b,g,s,w,t));
	}
	
	public static class Truck{
		int gold;
		int silver;
		int weight;
		int time;
		Truck(int g, int s, int w, int t){
			gold = g;
			silver = s;
			weight = w;
			time = t;
		}
	}
	
	public static long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long aTime = 0;
        long bTime = 0;
        long aWeight = 0;
        long bWeight = 0;
        int idx = 0;
        List<Truck> list = new ArrayList<>();
        
        for(int i=0; i<g.length; i++) {
        	list.add(new Truck(g[i],s[i],w[i],t[i]));
        }
        
        Collections.sort(list, (o1, o2) -> o1.time-o2.time);
        
        while(a > aWeight) {
        	Truck truck = list.get(idx);
        	if(truck.gold != 0) {
        		if(a < truck.gold + aWeight) {
        			long val = (a-aWeight)/truck.weight;
        			if(val == 0) {
        				aWeight += truck.weight;
        				aTime += truck.time;
        			} else {
	        			if((a-aWeight)%truck.weight == 0) {
	        				aWeight += (truck.weight*val);
	        				aTime += ((truck.time*2)*val)-truck.time;
	        			}else {
	        				aWeight += (truck.weight*(val+1));
	        				aTime += ((truck.time*2)*val)+truck.time;
	        			}
        			}
        		}else {
        			long val = truck.gold/truck.weight;
        			aWeight += truck.gold;
        			aTime += (truck.time*2)*val;
        			if(truck.gold%truck.weight == 0) aTime -= truck.time;
        			else aTime += truck.time;
        		}
        	}
        	idx++;
        }
        idx = 0;
        while(b > bWeight) {
        	Truck truck = list.get(idx);
        	if(truck.silver != 0) {
        		if(a < truck.silver + bWeight) {
        			long val = (b-bWeight)/truck.weight;
        			if(val == 0) {
        				bWeight += truck.weight;
        				bTime += truck.time;
        			} else {
	        			if((b-bWeight)%truck.weight == 0) {
	        				bWeight += (truck.weight*val);
	        				bTime += ((truck.time*2)*val)-truck.time;
	        			}else {
	        				bWeight += (truck.weight*(val+1));
	        				bTime += ((truck.time*2)*val)+truck.time;
	        			}
        			}
        		}else {
        			long val = truck.silver/truck.weight;
        			bWeight += truck.silver;
        			bTime += truck.time*val;
        			if(truck.silver%truck.weight == 0) bTime -= truck.time;
        			else bTime += truck.time;
        		}
        	}
        	idx++;
        }
        
        return Math.max(aTime, bTime);
    }
	
}
