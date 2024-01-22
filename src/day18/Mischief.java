package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Mischief {
	public ArrayList<Integer> sol(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] tmp = arr.clone();
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(arr[i]!=tmp[i])answer.add(i+1);
		}
		return answer;
	}

	public static void main(String[] args) {
		Mischief ex = new Mischief();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = kb.nextInt();
		}
		for(int x: ex.sol(n, arr))System.out.print(x+" ");

	}

}
