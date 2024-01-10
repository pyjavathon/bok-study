package day13;

import java.util.Scanner;

public class Extraction {//숫자만 추출
	public int solution2(String s) {
		String answer = "";
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x))answer+=x;
		}
		return Integer.parseInt(answer);
	}
	public int solution(String s) {
		int result;
		
		s = s.replaceAll("[^0-9]", "");
		
		result = Integer.parseInt(s);
		
		return result;
	}

	public static void main(String[] args) {
		Extraction ex = new Extraction();
		Scanner kb = new Scanner(System.in);

		String s = kb.next();
		
		System.out.println(ex.solution(s));
	}

}
