package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonachi {
	public ArrayList<Integer> sol(int n) {
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =0;i<n;i++) {
			if(i==0)list.add(1);
			else if(i==1) list.add(1);
			else {
				list.add(list.get(i-2)+list.get(i-1));
			}
		}
		
		return list;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Fibonachi ex = new Fibonachi();
		int n = kb.nextInt();
		
		for(int x:ex.sol(n))System.out.print(x+" ");;

	}

}
