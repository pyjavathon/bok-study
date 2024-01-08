package day11;

import java.util.Scanner;

public class DuplPermutation {
	static int n,m;
	public void dfs(int L) {
		if(L>m+1) {
			return;
		}else {
			for(int i = 1;i<=n;i++) {
				System.out.println(L+" "+i);
			}
				dfs(L+1);
			
		}
	}

	public static void main(String[] args) {

		DuplPermutation ex = new DuplPermutation();
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		m = s.nextInt();
		ex.dfs(1);
	}

}
