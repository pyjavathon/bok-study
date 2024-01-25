package dynamic_programming;

import java.util.Scanner;


public class StairsUp_Fibonacci {
	public int solution(int n) {
		int[] dy = new int[n+1];
		dy[1]=1;
		dy[2]=2;
		for(int i=3;i<=n;i++) {
			dy[i]=dy[i-2]+dy[i-1];
		}
		return dy[n];
	}
	public int sol(int n) {
		int[] method = new int[n+1];
		
		method[1]=1;
		method[2]=2;
		for(int i=2;i<n;i++) {
			method[i+1] = method[i]+method[i-1];
		}
		return method[7];
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		StairsUp_Fibonacci ex = new StairsUp_Fibonacci();
		int n = kb.nextInt();
		
		System.out.println(ex.sol(n));
	}

}
