package day9;

import java.util.Scanner;

public class Pibonachi {
	static int[] fibo;
	
	public int dfs(int n) {
		if(fibo.length>0)return fibo[n];
		if(n==1)return fibo[n]=1;
		else if(n==2)return fibo[n]=1;
		else return fibo[n]=dfs(n-2)+dfs(n-1);
	}
	
	public static void main(String[] args) {
		Pibonachi ex = new Pibonachi();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		fibo = new int[n+1];
		for(int i = 1; i<=n;i++)System.out.print(fibo[i]+" ");
	}

}
