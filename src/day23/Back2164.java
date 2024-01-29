package day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Back2164 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			list.add(i);
		}
		
		while(list.size()!=1) {
			list.remove(0);
			list.add(list.size(), list.get(0));
			list.remove(0);
			
		}
		for(int x:list)System.out.print(x+" ");
	}

}
