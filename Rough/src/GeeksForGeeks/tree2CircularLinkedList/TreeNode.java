package GeeksForGeeks.tree2CircularLinkedList;

public class TreeNode {
TreeNode leftNode;
int value;
TreeNode rightNode;
TreeNode parentNode;
boolean traversed = false;
public TreeNode(TreeNode leftNode, int value, TreeNode rightNode,
		TreeNode parentNode, boolean traversed) {
	this.leftNode = leftNode;
	this.value = value;
	this.rightNode = rightNode;
	this.parentNode = parentNode;
	this.traversed = traversed;
}


}
