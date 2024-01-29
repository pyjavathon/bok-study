package day22;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Back25757 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		char c = kb.next().charAt(0);
		System.out.println(c);
		
		Set<String> set = new TreeSet<>();
		
		for(int i=0;i<n;i++) {
			String str = kb.next();
			set.add(str);
		}
		if(c=='Y') System.out.println(set.size());
		else if(c=='F')System.out.println(set.size()/2);
		else System.out.println(set.size()/3);
	}

}
