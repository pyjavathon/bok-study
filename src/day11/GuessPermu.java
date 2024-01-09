package day11;

import java.util.Scanner;

public class GuessPermu {
	static int n,f;
	static int[] b,p,ch;
	boolean flag = false;
	int[][]dy = new int[35][35];
	
	public void dfs(int L, int sum) {
		if(flag)return;
		if(L==n) {
			if(sum==f) {
				for(int x: p)System.out.print(x+" ");
				flag=true;
			}
		}else {
			for(int i = 1; i<=n; i++) {
				if(ch[i]==0) {
					ch[i]=1;
					p[L]=i;
					dfs(L+1,sum+(p[L]*b[L]));
					ch[i]=0;
				}
			}
		}
	}
	
	public int combi(int n,int r) {
		if(dy[n][r]>0)return dy[n][r];
		if(n==r || r==0) return 1;
		else return dy[n][r]=combi(n-1,r-1)+combi(n-1,r);
	}

	public static void main(String[] args) {
		GuessPermu ex = new GuessPermu();
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		f = s.nextInt();
		b = new int[n];
		p = new int[n];
		ch = new int[n+1];
		for(int i=0; i<n; i++) {
			b[i] = ex.combi(n-1,i);
		}
		
		ex.dfs(0,0);
	}

}
