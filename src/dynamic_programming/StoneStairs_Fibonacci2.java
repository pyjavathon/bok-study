package dynamic_programming;

import java.util.Scanner;

public class StoneStairs_Fibonacci2 {
	public int sol(int n) {
		int[] dy = new int[n+2];
		dy[1]=1;
		dy[2]=2;
		for(int i=3;i<=n+1;i++) {
			dy[i]=dy[i-2]+dy[i-1];
		}
		return dy[n+1];
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		StoneStairs_Fibonacci2 ex = new StoneStairs_Fibonacci2();
		int n = kb.nextInt();
		System.out.println(ex.sol(n));
	}

}
