package day18;

import java.util.Scanner;
import java.util.Stack;

public class IronBar {
	public int sol(String s) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)=='(') stack.push('(');
			else {
				stack.pop();
				if(s.charAt(i-1)=='(') answer +=stack.size();
				else answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Postfix ex = new Postfix();
		Scanner kb = new Scanner(System.in);
		
		String s = kb.next();
		
		System.out.println(ex.sol(s));

	}

}
