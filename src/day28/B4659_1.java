package day28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B4659_1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		
		
		while(true) {
			sb.append("<");
			int mo = 0;
			int ja = 0;
			String s = br.readLine();
			init(s);
			
			sb.append(s+"> ");
			if(s.contains("a") || s.contains("e")|| s.contains("i") || s.contains("o") || s.contains("u")) {
				char c = 'A';
				for(int i=0;i<s.length();i++) {
					
					if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
						mo++;
					}else ja++;
					
					if(c==s.charAt(i)) {
						if(s.charAt(i)=='e' || s.charAt(i)=='o') {
							continue;
						}
						sb.append("is not acceptable"+"\n");
						break;
					}
					
					if(mo>=3 ||ja >= 3) {
						sb.append("is not acceptable"+"\n");
						break;
					}
					
					c = s.charAt(i);
				}
			}else {
				sb.append("is not acceptable"+"\n");
				continue;
			}
			System.out.println(sb);
		}
		
		
		
	}

	public static boolean init(String s) {
		if(s.equals("end"))return false;
		return true;
	}
}
