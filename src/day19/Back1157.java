package day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Back1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken();
		HashMap<Character,Integer> map = new HashMap<>();
		for(char c: str.toCharArray()) {
			c = Character.toUpperCase(c);
			map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		int max = Collections.max(map.values());
		int cnt = 0;
		for(int x : map.values()) {
			if(x==max) cnt++;
		}
		System.out.println(map.entrySet());
		System.out.println(cnt);
		if(cnt>1) System.out.println("?");
		else System.out.println(Collections.max(map.keySet()));
		
	}

}
