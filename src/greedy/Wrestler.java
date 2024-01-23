package greedy;

import java.util.Scanner;


class Boy{
	int height;
	int weight;
	public Boy(int h, int w) {
		this.height = h;
		this.weight = w;
	}
}
public class Wrestler {
	public int sol(int n , Boy[] arr) {
		int cnt = n;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i].height < arr[j].height && arr[i].weight < arr[j].weight) {
					cnt--;
					break;
				}
			}
			
		}
		return cnt;
	}

	public static void main(String[] args) {
		Wrestler ex = new Wrestler();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		Boy[] arr = new Boy[n];
		
		for(int i=0;i<n;i++) {
			int h = kb.nextInt();
			int w = kb.nextInt();
			arr[i] = new Boy(h,w);
		}
		
		System.out.println(ex.sol(n,arr));


	}

}
