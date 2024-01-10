package day13;

import java.util.Scanner;

public class SearchString {
	
	public int solution(String stss, char s) {
		int answer = 0;
		stss = stss.toUpperCase();
		s = Character.toUpperCase(s);
		for(char c : stss.toCharArray()) {
			if(c == s)answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		SearchString ex = new SearchString();
		Scanner kb = new Scanner(System.in);
		
		String stss = kb.next();
		char s = kb.next().charAt(0);
		System.out.println(ex.solution(stss,s));
		
	}

}
