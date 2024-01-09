package day12;

import java.util.Scanner;

public class Combination {
	static int n,m;
	static int[] pm;
	
	public void dfs(int L,int s) {
		if(L==m) {
			for(int x:pm)System.out.print(x+" ");
			System.out.println();
		}else {
			for(int i = s; i<=n; i++) {
				pm[L]=i;
				dfs(L+1,i+1);
				}
			}
		}
	
	public static void main(String[] args) {
		Combination ex = new Combination();
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		m = s.nextInt();
		
		pm = new int[m];
		
		ex.dfs(0,1);
	}

}
