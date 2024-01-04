package day9;

import java.util.Scanner;

public class BinaryNumber {
	
	public void recursive(int n) {

		if(n/2==0) {
			System.out.print(n%2);
			return;
		}else {
			recursive(n/2);
			System.out.print(n%2);
		}
	}
	
	public static void main(String[] args) {
		BinaryNumber ex = new BinaryNumber();
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		ex.recursive(n);
	}

}
