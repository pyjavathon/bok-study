package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
	public ArrayList<String> solution2(String[] arr){
		ArrayList<String> list = new ArrayList<>();
		for(String s: arr) {
			String tmp = new StringBuilder(s).reverse().toString();
			list.add(tmp);
		}
		return list;
	}
	
	public ArrayList<String> solution(String[] arr) { 
		ArrayList<String> list = new ArrayList<>();
		for(String s : arr) {
			char[] c = s.toCharArray();
			int lt = 0;
			int rt = s.length()-1;
			while(lt<rt) {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(c);
			list.add(tmp);
		}
		return list;
		
	}	

	public static void main(String[] args) {
		Reverse ex = new Reverse();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		String[] strArr = new String[n];
		for(int i =0;i<n;i++) strArr[i] = kb.next();
		
		for(String s: ex.solution(strArr)) {
			System.out.println(s);
		}
	}

}
