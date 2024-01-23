package day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back2292 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.valueOf(st.nextToken());
		int cnt = 0;
		if(n==1) cnt = 1;
		else {
			while(n>1) {
				n = n-(6*cnt);
				cnt++;		
			}
		}
		System.out.println(cnt);
	}

}
