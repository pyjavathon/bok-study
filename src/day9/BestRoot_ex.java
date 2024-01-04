package day9;

class Node_ex{
	int data;
	Node_ex rt,lt;
	public Node_ex(int val) {
		data = val;
		rt= lt=null;
	}
}

public class BestRoot_ex {
	Node_ex root;
	
	public int dfs(int L, Node_ex root) {
	 	if(root.lt == null && root.rt == null) {
	 		return L;
	 	}else {
	 		return Math.min(dfs(L+1,root.lt), dfs(L+1,root.rt));
	 	}
	}
	public static void main(String[] args) {
		BestRoot_ex tree = new BestRoot_ex();
		tree.root = new Node_ex(1);
		tree.root.lt = new Node_ex(2);
		tree.root.rt = new Node_ex(3);
		tree.root.lt.lt = new Node_ex(4);
		tree.root.lt.rt = new Node_ex(5);
		System.out.println(tree.dfs(0, tree.root));
	}

}
