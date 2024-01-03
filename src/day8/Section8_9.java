package day8;

import java.util.Scanner;

public class Section8_9 {
	
	static int n,m;
	static int[] combi;

	public void DFS(int L, int s) {
		
		if(L==m) {
			for(int x : combi) System.out.print(x+" ");
			System.out.println();
		}else {
			for(int i = s; i<=n;i++) {
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
	
	}
	
	public static void main(String[] args) {
		Section8_9 ex = new Section8_9();
		
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		m = s.nextInt();
		
		combi = new int[m];
		
		ex.DFS(0,1);
		
	}

}
