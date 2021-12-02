package algorithm;

import java.util.*;

public class SegmentTree {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int[][] process = {{1,3,6},{2,2,5},{1,5,2},{2,3,5}};
		solution(nums,process);
	}
	
	static long[] arr;
	static long[] tree;

	private static void solution(int[] nums, int[][] process) {
		int n = nums.length;
		arr = new long[n+1];
		tree = new long[n*4];
		
		for(int i=1; i<=n; i++) {
			arr[i] = nums[i-1];
		}
		
		init(1,n,1);
		
		for(int i=0; i<process.length; i++) {
			if(process[i][0] == 1) {
				long dif = process[i][2] - arr[process[i][1]];
				arr[process[i][1]] = process[i][2];
				update(1,n,1,process[i][1],dif);
			}else {
				long sum = sum(1,n,1,process[i][1],process[i][2]);
				System.out.println(sum);
			}
		}
		
	}

	//start : �����ε���, end : ���ε���
	private static long init(int start, int end, int node) {
		if(start == end) {
			return tree[node] = arr[start];
		}
		int mid = (start+end)/2;
		return tree[node] = init(start,mid,node*2) + init(mid+1,end,node*2+1);
	}

	//start : �����ε���, end : ���ε���, idx : ������ �ε���, dif : ������ ��
	private static void update(int start, int end, int node, int idx, long dif) {
		//���� ���� ���
		if(idx > end || idx < start) {
			return;
		}
		
		//���� �ȿ� �ִ°��
		tree[node] += dif;
		
		if(start == end) {
			return;
		}
		
		int mid = (start+end)/2;
		update(start,mid,node*2,idx,dif);
		update(mid+1,end,node*2+1,idx,dif);
		
	}

	private static long sum(int start, int end, int node, int left, int right) {
		//���� ���� ���
		if(left > end || right < start) {
			return 0;
		}
		
		//���� �ȿ� �ִ°��
		if(left <= start && end <= right) {
			return tree[node];
		}
		
		int mid = (start+end)/2;
		
		//�׷�ġ ���� ��� �ΰ� �κ����� ������ ���� ����
		return sum(start,mid,node*2,left,right) + sum(mid+1,end,node*2+1,left,right);
	}

}
