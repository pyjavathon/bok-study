package day27;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class B11723 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<=n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			System.out.println(s);
			int a = 0;
			if(st.hasMoreTokens())a = Integer.parseInt(st.nextToken());
			
			int x = solution(s,a);
			if(x==1 || x == 0)System.out.println(x);
		}
		
		
	}
	
	static Set<Integer> set = new TreeSet<>();
	
	public static int solution(String s, int a) {
		
		
		if(s.equals("add")) {
			set.add(a); 
			return -1;
		}
		else if(s.equals("remove")) {
			set.remove(a);
			return -1;
		}
		else if(s.equals("check")) {
			//System.out.println("test ="+a);
			if(set.contains(a)) {
				
				return 1;
			}
			else return 0;
		}
		else if(s.equals("toggle")) {
			if(set.contains(a)) {
				set.remove(a);
				return -1;
			}
			else {
				set.add(a);
				return -1;
			}
		}
		else if(s.equals("all")) {
			for(int i=1;i<=20;i++) {
				set.add(i);
			}
			return -1;
		}
		else {
			set.clear();
			return -1;
		}
	}
}
