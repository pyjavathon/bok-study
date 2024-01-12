package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class BestShortDistance {
	
	public int[] solution2(String s, char t) {
		int[] answer = new int[s.length()];
		int p = 1000;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==t) {
				p=0;
				answer[i]=p;
			}else {
				p++;
				answer[i] = p;
			}
		}
		p=1000;
		for(int i=s.length();i>=0;i--) {
			if(s.charAt(i)==t) p=0;
			else {
				p++;
				answer[i]=Math.min(answer[i], p);
			}
		}
		return answer;
	}
	
	public int[] solution(String s, String t) {
		ArrayList<Integer> list = new ArrayList<>();
		char[] arr = s.toCharArray();
		char t2 = t.charAt(0);
		int[] ch = new int [arr.length];
		for(int i =0; i<arr.length;i++) {
			if(arr[i]==t2)list.add(i);
		}
		//for(int x: list)System.out.print("list : "+x+" ");
		int answer = Integer.MAX_VALUE;
		for(int i = 0;i < s.length(); i++) {
			for(int j = 0;j<list.size();j++) {
				answer = Math.min(Math.abs(i-list.get(j)), answer) ;
			}
			ch[i] = answer;
			answer = Integer.MAX_VALUE;
		}
		return ch;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		BestShortDistance ex = new BestShortDistance();
		
		String s = kb.next();
		
		String t = kb.next();
		//char c = kb.next().charAt(0);
		for(int x : ex.solution(s,t)) System.out.print(x+" ");
	}

}
