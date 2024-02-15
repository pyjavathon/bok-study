package day28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B7568_1 {
	
	public void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int w[] = new int[N];
		int h[] = new int[N];
		int rank[] = new int[N];
		
		for(int i = 0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w[i] = Integer.parseInt(st.nextToken());
			h[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<N;i++) {
			int cnt = 1;
			for(int j=0;j<N;j++) {
				if(i==j)continue;
				
				if(w[i]<w[j] && h[i]<h[j]) cnt+=1;
			}
			rank[i] = cnt;
		}
		
		for(int x: rank) {
			System.out.print(x+" ");
		}
		
	}

}
