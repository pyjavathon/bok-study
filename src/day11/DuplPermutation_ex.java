package day11;

import java.util.Scanner;

public class DuplPermutation_ex {

	static int n, m;
	static int[] pm;
	
	public void dfs(int L) {
		if(L==m) {
			for(int x : pm)System.out.print(x+" ");
			System.out.println();
		}else {
			for(int i = 1; i<=n;i++) {
				pm[L] = i;
				dfs(L+1);
			}
		}
	}
	public static void main(String[] args) {
		DuplPermutation_ex ex = new DuplPermutation_ex();
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		m = s.nextInt();
		pm = new int[m];
		ex.dfs(0);
		
	}
}
