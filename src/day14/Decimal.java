package day14;

import java.util.Scanner;

public class Decimal {
	public int sol(int n) {
		int cnt = 0;
		int[] ch = new int[n+1];
		for(int i = 2; i<=n;i++) {
			if(ch[i]==0) {
				cnt++;
				for(int j=i;j<=n;j=j+i)ch[j]=1;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Decimal ex = new Decimal();
		
		int n =  kb.nextInt();
		System.out.println(ex.sol(n));
	}

}
