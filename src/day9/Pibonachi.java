package day9;

import java.util.Scanner;

public class Pibonachi {
	
	public int dfs(int n) {
		if(n==1)return 1;
		else if(n==2)return 1;
		else return dfs(n-2)+dfs(n-1);
	}
	
	public static void main(String[] args) {
		Pibonachi ex = new Pibonachi();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 1; i<=n;i++)System.out.print(ex.dfs(i)+" ");
	}

}
