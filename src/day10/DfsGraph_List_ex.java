package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class DfsGraph_List_ex {
	static int n, m, answer = 0;
	static int[] ch;
	static ArrayList<ArrayList<Integer>> graph;
	
	public void dfs(int L) {
		if(L==n) answer++;
		else {
			for(int nx : graph.get(L)) {
				if(ch[nx]==0) {
					ch[nx] =1;
					dfs(nx);
					ch[nx]=0;
				}
			}
		}
	}
	public static void main(String[] args) {
		DfsGraph_List_ex ex = new DfsGraph_List_ex();
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		m = s.nextInt();
		ch = new int[n+1];
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=n;i++) {
			graph.add(new ArrayList<Integer>());
		}
		for(int i=0;i<m;i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			graph.get(a).add(b);
		}
		ch[1] = 1;
		ex.dfs(1);
		System.out.println(answer);
	}

}
