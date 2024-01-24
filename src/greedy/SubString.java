package greedy;

import java.util.Scanner;

public class SubString {
	public String sol(String str) {
		String answer = "";
		int n = Integer.MIN_VALUE, pos;
		while((pos = str.indexOf(" "))!=-1) {
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			if(len>n) {
				n = len;
				answer = tmp;
			}
			str = str.substring(pos+1);
		}
		if(str.length()>n)answer = str;
		return answer;
	}
	public String solution(String str) {
		String answer = "";
		int n = Integer.MIN_VALUE;
		String[] arr = str.split(" ");
		for(String s:arr) {
			int len = s.length();
			if(len>n) {
				n=len;
				answer = s;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		SubString ex = new SubString();
		String str = kb.nextLine();
		System.out.println(ex.sol(str));
		
		
	}

}
