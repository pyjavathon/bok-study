package day9;
class Nodes{
	int data;
	Nodes lt,rt;
	public Nodes(int val) {
		data = val;
		lt = rt = null;
	}
}
public class BestRoot {

	static int answer = Integer.MAX_VALUE;
	Nodes root;
	
	public void dfs(Nodes root, int L) {
		if(root == null) {
			answer = Math.min(answer, L);
		}else {
			dfs(root.lt,L+1);
			dfs(root.rt,L+1);
		}
	}
	public static void main(String[] args) {
	
		BestRoot tree = new BestRoot();
		tree.root = new Nodes(1);
		tree.root.lt = new Nodes(2);
		tree.root.rt = new Nodes(3);
		tree.root.lt.lt = new Nodes(4);
		tree.root.lt.rt = new Nodes(5);
		
		tree.dfs(tree.root,0);
		System.out.println(answer);
	}
}
