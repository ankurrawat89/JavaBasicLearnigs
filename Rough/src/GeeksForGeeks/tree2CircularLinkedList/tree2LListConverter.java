package GeeksForGeeks.tree2CircularLinkedList;

public class tree2LListConverter {
public static void main(String args[]){
	Tree tree = new Tree();
	TreeNode rootNode = tree.rootNode;
	CircularLinkedList cirularLinkedList = new CircularLinkedList();
    convert2CircularLinkedList(rootNode,cirularLinkedList);
    displayLinkedList(cirularLinkedList);
}

private static void convert2CircularLinkedList(TreeNode rootNode, CircularLinkedList cirularLinkedList) {
	TreeNode temp = rootNode;
	while(temp.leftNode!=null && temp.leftNode.traversed == false){
		temp = temp.leftNode;
	}
	temp.traversed = true;
	cirularLinkedList.insertAtLast(temp.value);
	if(temp.rightNode!=null){
		convert2CircularLinkedList(temp.rightNode,cirularLinkedList);
	}
		if(temp.parentNode!=null && temp.parentNode.traversed == false){
		temp = temp.parentNode;
		convert2CircularLinkedList(temp,cirularLinkedList);
	}	
}
public static void displayLinkedList(CircularLinkedList cirularLinkedList){
	LNode temp = cirularLinkedList.head;
	while(temp.nextLNode!=cirularLinkedList.head){
		System.out.print(temp.value+"-->");
		temp = temp.nextLNode;
	}
	System.out.print(temp.value);
	
}
}
