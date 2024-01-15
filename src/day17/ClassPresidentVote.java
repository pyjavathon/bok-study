package day17;

import java.util.HashMap;
import java.util.Scanner;

public class ClassPresidentVote {
	
	public char sol(int n, String str) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		int max = Integer.MIN_VALUE;
		for(char key:map.keySet()) {
			if(map.get(key)>max) {
				max = map.get(key);
				answer = key;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		ClassPresidentVote ex = new ClassPresidentVote();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		
		System.out.println(ex.sol(n,str));
	}

}
