package algorithm;

import java.util.*;

/* 문자열 검색
 * */

public class KMP {

	public static void main(String[] args) {
		String str = "ABCDABCDBBABCDABCDBB";
		String ptrn = "CDBB";
		solution(str,ptrn);
	}

	static List<Integer> list = new ArrayList<Integer>();
	
	private static void solution(String str, String ptrn) {
		int[] pi = getPi(ptrn);
		
		kmp(pi,str,ptrn);
		
		System.out.println(list.size());//해당 문자 개수
		for(int idx : list) System.out.println(idx);//해당 인덱스 위치
	}

	private static void kmp(int[] pi, String str, String ptrn) {
		int j = 0;
		int sLen = str.length();
		int pLen = ptrn.length();
		
		for(int i=0; i<sLen; i++) {
			while(j>0 && str.charAt(i) != ptrn.charAt(j)) {
				j = pi[j-1];
			}
			if(str.charAt(i) == ptrn.charAt(j)) {
				if(j+1 == pLen) {
					list.add(i-pLen+2);
					j = pi[j];
				}else {
					j++;
				}
			}
		}
		
	}

	private static int[] getPi(String ptrn) {
		int j = 0;
		int len = ptrn.length();
		int[] pi = new int[len];
		
		for(int i=1; i<len; i++) {
			while(j>0 && ptrn.charAt(i) != ptrn.charAt(j)) {
				j = pi[j-1];
			}
			if(ptrn.charAt(i) == ptrn.charAt(j)) {
				pi[i] = ++j;
			}
		}
		
		return pi;
	}
	
}
