package day13;

import java.util.Scanner;

public class WordsInSentence {

	
	/*
	 * public String solution2(String str) { String answer = ""; int m =
	 * Integer.MIN_VALUE, pos; while ((pos = str.indexOf(' ')) != -1) { String tmp =
	 * str.substring(0, pos); int len = tmp.length(); if (len > m) { m = len; answer
	 * = tmp; } str = str.substring(pos + 1); } }
	 */

	public String solution(String str) {
		String answer = "";
		int min = Integer.MIN_VALUE;
		String[] arr = str.split(" ");
		for (String s : arr) {
			int len = s.length();
			if (len > min) {
				min = len;
				answer = s;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		WordsInSentence ex = new WordsInSentence();
		Scanner kb = new Scanner(System.in);

		String str = kb.nextLine();

		System.out.println(ex.solution(str));

	}

}
