package day7;

import java.util.Scanner;

public class Section8_7 {

	public int DFS(int n, int r) {
		int[][] arr = new int[n][r];
		if(n==r || r==0)return 1;
		if(arr[n][r]>0)return arr[n][r];
		else {
			return arr[n][r] = DFS(n-1,r-1)+DFS(n-1,r);
		}
	}
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		Section8_7 ex = new Section8_7();
		
		int n = s.nextInt();
		
		int r = s.nextInt();
		
		System.out.println(ex.DFS(n,r));
		
	}
}
