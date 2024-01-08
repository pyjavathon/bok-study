package day11;

import java.util.Scanner;

public class Permutation {
	static int n, m;
	static int[] arr,pm,ch;
	public void dfs(int L) {
		if(L==m) {
			for(int x: pm)System.out.print(x+" ");
			System.out.println();
		}else {
			for(int i=0;i<n;i++) {
				if(ch[i]==0) {
					ch[i]=1;
					pm[L]=arr[i];
					dfs(L+1);
					ch[i]=0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Permutation ex = new Permutation();
		Scanner s = new Scanner(System.in);
		n =s.nextInt();
		m=s.nextInt();
		arr = new int[n];
		ch = new int[n];
		for(int i=0;i<n;i++)arr[i]=s.nextInt();
		pm = new int[m];
		ex.dfs(0);
	}

}
