package day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back10431 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());
		StringBuilder sb= new StringBuilder();
		StringTokenizer st;
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(in.readLine()," ");
			int[] arr = new int[20];


			sb.append(st.nextToken()).append(" ");
			int cnt = 0;
			for(int i=0;i<arr.length;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<i;j++) {
					if(arr[j] > arr[i]) {
						cnt++;
					}
				}
			}
			sb.append(cnt).append('\n');
		}
		System.out.println(sb);

	}

}
