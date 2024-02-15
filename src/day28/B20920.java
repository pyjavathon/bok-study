package day28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B20920 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean flag;
		ArrayList<Word> list = new ArrayList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int limit = Integer.parseInt(st.nextToken());
		
		
		String str = br.readLine();
		list.add(new Word(str.length(),1,str));
		
		for(int i=0;i<N-1;i++) {
			flag = false;
			str = br.readLine();
			//System.out.println("str : "+str);
			if(str.length()<limit) continue;
			for(int j = list.size()-1;j>=0;j--) {
				if(list.get(j).w.equals(str)) {
					list.get(j).many++;
					flag = true;
					break;
				}
			}
			if(flag) continue;
			list.add(new Word(str.length(),1,str));
		}
		//for(Word w: list)System.out.println("word : "+w.w+", many : "+w.many+", length : "+w.length);
		Collections.sort(list);
		
		  for(int i=0;i<list.size();i++) { 
			  System.out.println(list.get(i).w); 
			  }
		 
	}

}

class Word implements Comparable<Word>{
	int length;
	int many;
	String w;
	
	public Word(int length, int many, String w) {
		this.length = length;
		this.many = many;
		this.w = w;
	}
	
	@Override
	public int compareTo(Word other) {
		if(this.many == other.many) {
			if(this.length == other.length) {
				return this.w.compareTo(other.w);
			}
			return other.length-this.length;
		}else return other.many-this.many;
	}
	
	
}
