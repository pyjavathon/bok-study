package day13;

import java.util.Scanner;

public class Palindrome {
	
	public String solution(String s) {
		String answer = "NO";
		s = s.toUpperCase();
		
		char[] arr = s.toCharArray();
		int lt = 0, rt = arr.length-1;
		
		while(lt<rt) {
			char tmp = arr[lt];
			arr[lt] = arr[rt];
			arr[rt] = tmp;
			lt++;
			rt--;
		}
		String result= String.valueOf(arr);
		if(result.equals(s)) return answer = "YES";
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Palindrome ex = new Palindrome();
		
		String s = kb.next();
		
		System.out.println(ex.solution(s));
	}

}
