package day23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class Back20310 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		int num0 = 0,num1 = 0;
		StringBuilder sb = new StringBuilder();
		
		for(char c : str.toCharArray()) {
			sb.append(c);
			if(c=='0')num0++;
			else num1++;
		}
		num0/=2;
		num1/=2;
		
		for(int i=0;i<sb.length() && num1>0;i++) {
			if(str.charAt(i)=='1') {
				sb.setCharAt(i, '2');
				num1--;
			}
		}
		
		for(int i =sb.length()-1;i>=0 && num0>0;i--) {
			if(str.charAt(i)=='0') {
				sb.setCharAt(i, '2');
				num0--;
			}
		}
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)=='1'|| sb.charAt(i)=='0')System.out.print(sb.charAt(i));
		}
		
	}

}
