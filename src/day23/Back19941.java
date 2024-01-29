package day23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Back19941 {
	static char[] table;
	static int answer = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(st.nextToken());
		table = br.readLine().toCharArray();
		
		for(int i=0;i<n;i++) {
			if(table[i]=='P') {
				int index = Math.max(i-m, 0);
				boolean check = false;
				
				for(int j=index;j<i;j++) {
					if(burgerCh(j)) {
						check = true;
						break;
					}
				}
				
				if(!check) {
					index = i+m>=n?n-1:i+m;
					for(int j=i+1;j<=index;j++) {
						if(burgerCh(j)) break;
						}
					}
				}
			}
			bw.write(answer+"");
			bw.flush();
			bw.close();
			br.close();
			}
		
		
		static boolean burgerCh(int index) {
			if(table[index]=='H') {
				table[index] ='X';
				answer++;
				return true;
			}
			return false;
		}
		
	}


