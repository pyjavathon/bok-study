package day28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B4659_2 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String pw;
		char[] pass;
		String acc = "> is acceptable.\n";
		String not = "> is not acceptable.\n";
		StringBuilder sb = new StringBuilder();
		boolean flag;
		char prev;
		int count;
		while(!(pw = br.readLine()).equals("end")) {
			pass = pw.toCharArray();
			prev = '.';
			count = 0;
			
			flag = false;
			for(char p:pass) {
				if(isVowel(p)) flag = true;
				
				if(isVowel(p) != isVowel(prev)) count = 1;
				else count++;
				
				if(count > 2 || (prev==p &&(p!='e'&&p!='o'))) {
					flag = false;
					break;
				}
				prev = p;
			}
			if(flag) sb.append('<').append(pw).append(acc);
			else sb.append('<').append(pw).append(not);
		}
		
		//System.out.println(sb);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
	
	public static boolean isVowel(char ch) {
		return ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

}
