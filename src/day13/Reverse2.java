package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse2 {
	
	public String solution(String s) {
		
		String answer = "";
		char[]  arr= s.toCharArray();
		int lt = 0, rt = s.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(arr[lt])) lt++;
			else if(!Character.isAlphabetic(arr[rt]))rt--;
			else {
				char tmp = arr[lt];
				arr[lt] = arr[rt];
				arr[rt] = tmp;
				lt++;
				rt--;
			}
			
			
		}
		answer = String.valueOf(arr);
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Reverse2 ex = new Reverse2();
		
		String s = kb.next();
		
		System.out.print(ex.solution(s));
		
	}

}
