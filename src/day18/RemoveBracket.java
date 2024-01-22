package day18;

import java.util.Scanner;
import java.util.Stack;

public class RemoveBracket {
	
	public String sol(String s) {
		Stack<Character> stack = new Stack<>();
		
		String answer = "";
		
		for(char c: s.toCharArray()) {
			if(c!=')')stack.push(c);
			else{
				while(stack.peek()!='(') {
					stack.pop();
				}
				stack.pop();
			}
		}
		while(!stack.isEmpty()) answer += stack.pop();
		return answer;
	}

	public static void main(String[] args) {
		RemoveBracket ex = new RemoveBracket();
		Scanner kb = new Scanner(System.in);

		String s = kb.next();
		String answer = ex.sol(s);
		
		for(int i = answer.length()-1;i>=0;i--) {
			System.out.print(answer.charAt(i));
		}
	
	}

}
