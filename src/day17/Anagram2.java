package day17;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram2 {
	public int sol(String s1, String s2) {
		int answer = 0;
		HashMap<Character,Integer> map1 = new HashMap<>();
		HashMap<Character,Integer> map2 = new HashMap<>();
		
		for(char c : s2.toCharArray()) {
			map2.put(c, map2.getOrDefault(c, 0)+1);
		}
		int L = s2.length()-1;
		for(int i=0;i<L;i++) {
			map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0)+1);
		}
		int lt = 0;
		for(int rt=L;rt<s1.length();rt++) {
			map1.put(s1.charAt(rt), map1.getOrDefault(s1.charAt(rt), 0)+1);
			if(map1.equals(map2))answer++;
			map1.put(s1.charAt(lt), map1.get(s1.charAt(lt))-1);
			if(map1.get(s1.charAt(lt))==0)map1.remove(s1.charAt(lt));
			lt++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Anagram2 ex = new Anagram2();
		Scanner kb = new Scanner(System.in);
		
		String s1 = kb.next();
		String s2 = kb.next();
		
		System.out.println(ex.sol(s1,s2));

	}

}
