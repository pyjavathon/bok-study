package day18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EduDesign {
	public String sol(String e , String p) {
		String answer = "NO";
		
		Queue<Character> q = new LinkedList<>();
		
		for(char c: p.toCharArray()) {
			for(int i = 0;i<e.length();i++) {
				if(c==e.charAt(i)) {
					q.offer(c);
				}
			}
		}
		
		for(char c : e.toCharArray()) {
			if(c==q.peek())q.poll();
		}
		if(q.size() == 0)return "YES";
		return answer;
	}

	public static void main(String[] args) {
		EduDesign ex = new EduDesign();
		Scanner kb = new Scanner(System.in);

		String essential = kb.next();
		String plan = kb.next();
		
		System.out.println(ex.sol(essential, plan));
	}

}
