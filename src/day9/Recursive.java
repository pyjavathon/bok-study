package day9;

import java.util.Scanner;

public class Recursive {
	
	public void dfs(int L, int n) {
		if(L==n) {
			System.out.print(L+" ");
			return;
		}
		else {
			System.out.print(L+" ");
			dfs(L+1,n);
		}
	}
	
	public static void main(String[] args) {
		Recursive re = new Recursive();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		re.dfs(1,n);
		
	}

}
