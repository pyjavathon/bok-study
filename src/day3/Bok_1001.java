package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bok_1001 {
	
	public static void main(String[] args) throws IOException{
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * int A = scan.nextInt();
		 * 
		 * int B = scan.nextInt();
		 * 
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		int A = Integer.parseInt(st.nextToken());
		
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println(A-B);
		
	}

}
