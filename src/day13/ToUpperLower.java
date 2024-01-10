package day13;

import java.util.Scanner;

public class ToUpperLower {
	
	public String solution(String str) {
		String answer="";
		for(char c : str.toCharArray()) {
			if(Character.isUpperCase(c)) answer += Character.toLowerCase(c);
			else answer += Character.toUpperCase(c);
			
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ToUpperLower ex = new ToUpperLower();
		
		String str = kb.next();
		
		System.out.println(ex.solution(str));
	}

}
