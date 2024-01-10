package day13;

import java.util.Scanner;

public class RemoveDuplicate {
	
	public String solution(String str) {
		String answer = "";
		for(int i=0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i))==i)answer +=str.charAt(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		RemoveDuplicate ex = new RemoveDuplicate();
		
		String s = kb.next();
		System.out.println(ex.solution(s));
		
		int[] test = {1,2,3};
		for(int x : test)System.out.print("{"+x+" "+" } ");
		
	}

}
