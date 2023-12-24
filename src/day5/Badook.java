package day5;

import java.util.Scanner;

public class Badook {

	static int answer = Integer.MIN_VALUE,c,n;
	
	public void DFS(int L, int sum, int[] arr) {
		if(sum>c) return;
		if(L==n) {
			answer = Math.max(answer, sum);
		}
		else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
	}
	public static void main(String[] args) {

		Badook main = new Badook();
		
		Scanner s = new Scanner(System.in);
		
		c = s.nextInt();
		
		n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		main.DFS(0,0,arr);
		System.out.println(answer);
	}

}
