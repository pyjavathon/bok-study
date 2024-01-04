package day9;

import java.util.Scanner;

public class Factorial_ex {
	
	public int recursive(int n) {
		if(n==1)return 1;
		else return n*recursive(n-1);
	}
	
	public static void main(String[] args) {
		Factorial_ex ex = new Factorial_ex();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(ex.recursive(n));
	}

}
