package day9;

import java.util.Scanner;

public class BinaryNumber_ex {
	
	public void DFS(int n){
		if(n==0) return;
		else{
			DFS(n/2);
			System.out.print(n%2);
		}
	}

	
	
	public static void main(String[] args) {
		BinaryNumber_ex ex = new BinaryNumber_ex();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ex.DFS(n);
	}

}
