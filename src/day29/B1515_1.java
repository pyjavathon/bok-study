package day29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1515_1 {
	private void solution() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int pt = 0;
		int base = 0;
		
		while(base++ <= 30000) {
			String tmp = String.valueOf(base);
			for(int i=0;i<tmp.length();i++) {
				if(tmp.charAt(i)==s.charAt(pt)) pt++;
				if(pt==s.length()) {
					System.out.println(base);
					return;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		new B1515_1().solution();
	}

}
