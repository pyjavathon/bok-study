package day11;

import java.util.Scanner;

public class Coin {
	static int n,m, answer = Integer.MAX_VALUE;
	static int[] arr;
	public void dfs(int L,int sum) {
		if(sum>m)return;
		if(sum==m) {
			answer = Math.min(L, answer);
		}
		else {
				for(int i =0;i<n;i++) {
					dfs(L+1,sum+arr[i]);
				}
			
		}
	}
	public static void main(String[] args) {
		Coin ex = new Coin();
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		m = s.nextInt();
		ex.dfs(0,0);
		System.out.println(answer);
	}

}
