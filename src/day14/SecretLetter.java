package day14;

import java.util.Scanner;

public class SecretLetter {
	
	public String solution(int n, String s) {
		String answer = "";
		for(int i=0;i<n;i++) {
			String tmp = s.substring(0, 7).replace("#", "1").replace("*", "0");
			int num = Integer.parseInt(tmp,2);
			answer += (char)num;
			s= s.substring(7);
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		SecretLetter ex = new SecretLetter();
		
		int n = kb.nextInt();
		String s = kb.next();
		
		System.out.println(ex.solution(n,s));

	}

}
