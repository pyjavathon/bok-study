package day10;

import java.util.Scanner;

public class DfsGraph {
	static int n, m, answer = 0;
	static int[][] graph;
	static int[] ch;
	
	
	public void dfs(int L) {
		if(L==n) answer++;
		else {
			for(int i = 1;i<=n; i++) {
				if(ch[i]==0 && graph[L][i]==1) {
					ch[i]=1;
					dfs(i);
					ch[i]=0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DfsGraph ex = new DfsGraph();
		n = s.nextInt();
		m = s.nextInt();
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		
		
		for(int i = 0; i<m; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			graph[a][b] = 1;
			
		}
		ch[1] = 1;
		ex.dfs(1);
		System.out.println(answer);
		
	}

}
