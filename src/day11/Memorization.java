package day11;

import java.util.Scanner;

public class Memorization {
	static int n,r;
	
	public int dfs(int n, int r) {
		int[][] graph = new int[35][35];
		if(graph[n][r]>0)return graph[n][r];
		if(n==r||r==0) {
			return 1;
		}else {
			return graph[n][r]= dfs(n-1,r-1)+dfs(n-1,r);
		}
	}
	public static void main(String[] args) {
		Memorization ex = new Memorization();
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		r = s.nextInt();
		
		System.out.println(ex.dfs(n,r));
	}

}
