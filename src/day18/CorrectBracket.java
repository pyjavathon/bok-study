package day18;

import java.util.Scanner;
import java.util.Stack;

public class CorrectBracket {
	public String sol(String s) {
		String answer = "NO";
		
		Stack<Character> stack = new Stack<>();
		
		for(char c: s.toCharArray()) {
			
			if(c==')') {
				stack.pop();
			}
			else {
				stack.add(c);
			}
		}
		if(stack.isEmpty())return "YES";
		
		return answer;
	}

	public static void main(String[] args) {
		CorrectBracket ex = new CorrectBracket();
		Scanner kb = new Scanner(System.in);
		
		String s = kb.next();
		
		System.out.println(ex.sol(s));
	}
}
