package GeeksForGeeks.tree2CircularLinkedList;

public class CircularLinkedList {
LNode head;
public void insertAtLast(int value){
	LNode lNode = new LNode(value);
	if(head==null){
		lNode.nextLNode = lNode;
		head = lNode;
	}
	else{
		LNode temp = head;
		while(temp.nextLNode!=head){
			temp = temp.nextLNode;
		}
		lNode.nextLNode = temp.nextLNode;
		temp.nextLNode = lNode;
	}
}
}
