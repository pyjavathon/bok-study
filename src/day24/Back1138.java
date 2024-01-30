package day24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Back1138 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			int a = Integer.parseInt(st.nextToken());
			while(arr[a]!=0) {
				a++;
			}

			arr[a] = i;
			
		}
		for(int i=0;i<N;i++) {
			bw.write(arr[i]+" ");
		}
		bw.flush();
		bw.close();
		br.close();
		
	}

}
