package day29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14719 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] h = new int[W];
		for(int i=0;i<W;i++) h[i] = Integer.parseInt(st.nextToken());
		//test
		
		int rain = 0;
		
		for(int i=1;i<W-1;i++) {
			int leftH = 0;
			int rightH = 0;
			
			for(int j=0;j<i;j++) {
				leftH = Math.max(h[j], leftH);
			}
			
			for(int j=i+1;j<W;j++) {
				rightH = Math.max(h[j], rightH);
			}
			
			if(h[i]<leftH && h[i] < rightH) rain+=Math.min(leftH, rightH)-h[i];
		}
		System.out.println(rain);
	}

}
