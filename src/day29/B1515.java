package day29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1515 {
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		String str =  br.readLine();
		int[] arr = new int[str.length()];
		
		for(int i=0;i<str.length();i++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
		}
		int cnt = 0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]>=arr[i]) {
				cnt++;
			}
		}
		
		int a = arr[arr.length-1]+cnt*10;
		int b = arr[arr.length-1]*10;
		int min = Math.min(a, b);
		
		System.out.println(min);
	}
	
}
