package day4;

import java.util.Scanner;

public class Section6_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i< arr.length;i++) {
			arr[i] = s.nextInt();
		}
		
		
		
		for(int i = 0; i<arr.length;i++) {
			int p1 = i, temp;
			for(int j = i+1; j<arr.length;j++) {
				if(arr[p1] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[p1];
					arr[p1] = temp;
				}
				
				p1++;
			}
			
		}
		
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
