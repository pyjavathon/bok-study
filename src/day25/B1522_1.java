package day25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1522_1 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int min = Integer.MAX_VALUE;
		int a_len = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') a_len++;
		}
		
		for(int i=0;i<str.length();i++) {
			int b_cnt = 0;
			for(int j=i;j<a_len+i;j++) {
				if(str.charAt(j%str.length())=='b') b_cnt++;
			}
			min = Math.min(min, b_cnt);
		}
		System.out.println(min);
	}

}
