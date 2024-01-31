package day25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1522 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int bcnt = 0;
		int answer = Integer.MAX_VALUE;
		char[] cArr = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			cArr[i] = str.charAt(i);
			if(cArr[i]=='b') bcnt++;
		}
		int lt = 0;
		while(lt != cArr.length-1-bcnt) {
			int ach = 0;
			int bch = 0;
			for(int i=lt;i<cArr.length;i++) {
				if(cArr[i]=='a') {
					ach++;
					bch++;
				}else bch++;
				if(bch==bcnt)break;
			}
			answer = Math.min(ach, answer);
			lt++;
		}
		
		
		System.out.println(answer);
	}

}
