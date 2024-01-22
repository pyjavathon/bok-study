package day18;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
	

	
	public int sol(String s) {
		int answer =0;
		
		Stack<Integer> stack = new Stack<>();
		
		for(char  c : s.toCharArray()) {
			if(Character.isDigit(c)) {
				stack.push(c-48);
			}
			else {
				int rt = stack.pop();
				int lt = stack.pop();
				if(c=='+')stack.push(lt+rt);
				else if(c=='-')stack.push(lt-rt);
				else if(c=='*')stack.push(lt*rt);
				else if(c=='/')stack.push(lt/rt);
			}
		}
		answer = stack.get(0);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Postfix ex = new Postfix();
		Scanner kb = new Scanner(System.in);
		
		String s = kb.next();
		
		System.out.println(ex.sol(s));
		
	}

}
