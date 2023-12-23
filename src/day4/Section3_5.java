package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Section3_5 {
	
	public int solution(int n) {
		
		int answer = 0, cnt = 1;
		n--;
		while(n>0) {
			cnt++;
			n = n-cnt;
			if(n%cnt ==0) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		
		Section3_5 ex = new Section3_5();
		
		/*
		 * Scanner s = new Scanner(System.in);
		 * 
		 * int n = s.nextInt();
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
				
		
		System.out.println(ex.solution(n));
	}

}
