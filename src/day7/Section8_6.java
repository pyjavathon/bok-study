package day7;

import java.util.Scanner;

public class Section8_6 {
	
	static int n,m;
	static int[] arr,ch,pm;
	
	public void DFS(int L) {
		if(L==m) {
			for(int x: pm) System.out.print(x+" ");
			System.out.println();
		}else {
			for(int i = 0; i< n; i++) {
				if(ch[i]==0) {
					ch[i] = 1;
					pm[L] = arr[i];
					DFS(L+1);
					ch[i] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		Section8_6 ex = new Section8_6();
		
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		m = s.nextInt();
		
		arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = s.nextInt();
		ch = new int[n];
		pm = new int[m];
		ex.DFS(0);
		
	}

}
