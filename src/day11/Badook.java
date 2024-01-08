package day11;

import java.util.Scanner;

public class Badook {
	static int c,n,answer = Integer.MIN_VALUE;
	
	public void dfs(int L, int sum, int[] arr) {
		if(sum>c)return;
		if(L==n) {
			answer = Math.max(sum, answer);
		}else {
			dfs(L+1, sum+arr[L],arr);
			dfs(L+1,sum,arr);
		}
	}
	
	public static void main(String[] args) {
		Badook ex = new Badook();
		Scanner s = new Scanner(System.in);
		
		c = s.nextInt();
		
		n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n;i++) {
			arr[i] = s.nextInt();
		}
		ex.dfs(0,0,arr);
		System.out.println(answer);
	}

}
