package day6;

import java.util.Scanner;

public class Section8_4 {
	
	static int[] pm;
	static int n, m;
	
	public void DFS(int L) {
		if(L==m) {
			for(int x:pm)System.out.print(x+" ");
			System.out.println();
		}else {
			for(int i = 1; i<=n;i++) {
				pm[L] = i;
				DFS(L+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Section8_4 ex = new Section8_4();
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		m = s.nextInt();
		
		pm = new int[m];
		ex.DFS(0);
	}

}
