package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Coordi implements Comparable<Coordi>{
	int x;
	int y;
	public Coordi(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Coordi c) {
		if(this.x == c.x) return this.y-c.y;
		else return this.x-c.x;
	}
}
public class CoordinateSort {

	public static void main(String[] args) {
		CoordinateSort ex = new CoordinateSort();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
	
		ArrayList<Coordi> arr = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Coordi(x,y));
		}
		Collections.sort(arr);
		for(Coordi c:arr)System.out.println(c.x+" "+c.y);
	}

}
