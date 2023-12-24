package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Section6_2__1 {
	
	public int[] solution(int n, int[]arr) {
		
		for(int i = 0;i<n-1;i++) {
			for(int j = 0; j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		return arr;
	}

	public static void main(String[] args) throws IOException{
		
		Section6_2__1 ex = new Section6_2__1();
		
		//Scanner s = new Scanner(System.in);
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		int n = Integer.parseInt(s.readLine());
		String str = s.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		int[] arr = new int[n];
		for(int i = 0; i< n; i++) arr[i] = Integer.parseInt(st.nextToken());
		for(int x : ex.solution(n,arr)) System.out.print(x+" ");
		

	}

}
