package day22;

import java.util.Scanner;

public class Palindrome {
	public String sol(String str) {
		String tmp = str.toUpperCase().replace(" ", "").replaceAll("[^A-Z]", "");
		String s = String.valueOf(new StringBuilder(tmp).reverse());
		if(tmp.equals(s))return "YES";
		
		return "NO";
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Palindrome ex = new Palindrome();
		String str = kb.nextLine();
		
		System.out.println(ex.sol(str));

	}

}
