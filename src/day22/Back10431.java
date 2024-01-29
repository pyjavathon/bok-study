package day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back10431 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int HangNum = Integer.parseInt(in.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int hang=1;hang<=HangNum;hang++) {
			
			st = new StringTokenizer(in.readLine()," ");
			int[] heights = new int[20];
			
			sb.append(st.nextToken()).append(" ");
			int cnt = 0;
			
			for(int i=0;i<heights.length;i++) {
				heights[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i=0;i<heights.length;i++) {
				for(int j=0;j<i;j++) {
					if(heights[j]>heights[i]) cnt++;
				}
			}
			sb.append(cnt).append("\n");
			
			
		}
		
		System.out.println(sb);
	}

}
