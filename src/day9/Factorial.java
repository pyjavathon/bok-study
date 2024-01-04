package day9;

import java.util.Scanner;

public class Factorial {
	
	public int recursive(int n) {
		if(n==0)return 1;
		else {
			return n*recursive(n-1);
		}
	}
	
	public static void main(String[] args) {
		Factorial ex = new Factorial();
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		System.out.println(ex.recursive(n));
	}

}
