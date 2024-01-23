package day19;

import java.util.Scanner;

public class Back1157_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] alphabet = new int[26];
		String str = scan.next().toUpperCase();
		
		for(int i=0;i<str.length();i++) {
			int tmp = str.charAt(i)-65;
			alphabet[tmp]++;
		}
		int max = Integer.MIN_VALUE;
		char ch = ' ';
		for(int i=0;i<alphabet.length;i++) {
			if(alphabet[i]>max) {
				max = alphabet[i];
				ch = (char)(i+65);
			}
			else if(alphabet[i]==max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}
