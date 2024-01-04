package day9;

import java.util.Scanner;

public class Recursive_ex {
	
	public void dfs(int n) {
		if(n==0)return;
		else {
			dfs(n-1);
			System.out.print(n+" ");
			//재귀함수 아랫줄에 적으면 순서 반대로 출력됨
		}
	}
	
	public static void main(String[] args) {
		Recursive_ex ex = new Recursive_ex();
		Scanner s = new Scanner(System.in);
		ex.dfs(s.nextInt());
	}

}
