package day13;

import java.util.Scanner;

public class Palindrome2 {
	
	public String solution2(String s) {
		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer = "YES";
		return answer;
	}

	public String solution(String s) {
		String answer = "NO";
		s = s.toUpperCase();
		char[] arr = s.toCharArray();
		int lt = 0, rt = s.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(arr[lt]))lt++;
			else if(!Character.isAlphabetic(arr[rt]))rt--;
			else {
				Character.toUpperCase(arr[lt]);
				Character.toUpperCase(arr[rt]);
				char tmp = arr[lt];
				arr[lt] = arr[rt];
				arr[rt] = tmp;
				lt++;
				rt--;
			}
		}
		String result = String.valueOf(arr);
		
		System.out.println(s);
		
		if(result.equals(s)) return "YES";
		
		return answer;
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Palindrome2 ex = new Palindrome2();
		
		String s = kb.nextLine();
		
		System.out.println(ex.solution(s));
	}

}
