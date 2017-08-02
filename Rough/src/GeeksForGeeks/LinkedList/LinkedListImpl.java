package GeeksForGeeks.LinkedList;

public class LinkedListImpl {
Node head;
//to insert element at the head of linkedlist
public void insertAtBeg(int data){
	Node node = new Node(data);
	node.next = head;
	head = node;
}
//to insert element at the end of linkedlist
public void insertAtLast(int data){
	Node node = new Node(data);
	if(head == null){
		head = node;
		return;
	}
	Node temp = head;
	while(temp.next!=null){
		temp = temp.next;
	}
	temp.next = node;
}
//to insert element after a given node in linked list
//nodeData is the data of the node after which new node need to be inserted
public void insertAftrGvnNode(int data,int nodeData){
	if(chkForEmpty(head)){
		return;
	}
	Node temp = head;
	Node node = new Node(data);
	while(temp!=null){
		if(temp.data == nodeData){
			node.next = temp.next;
			temp.next = node;
			return;
		}
		temp = temp.next;
	}
	System.out.println("Node : "+nodeData+" ,does not exist in linked list");
}
//to delete node at a given position
public void deleteNode(int position){
	if(chkForEmpty(head)){
		return;
	}
	Node temp = head;
	if(position==0){
		head = temp.next;
		return;
	}
	int count=0;
	while(temp!=null){
		if(count==position-1){
			temp.next = temp.next.next;
			return;
		}
		count++;
		temp = temp.next;
	}
	System.out.print("\nPosition : "+position+" , does not exist in linked list");
}
//iterative approach for finding length of linked list(Iterative)
public int linkedListLengthItr(){
	int count=0;
	Node temp = head;
	while(temp!=null){
		count++;
		temp = temp.next;
	}
	return count;
}
//recursive approach for finding length of linked list(Recursion)
public int linkedListLengthRec(Node head){
	if(chkForEmpty(head)){
		return 0;
	}
		return 1 + linkedListLengthRec(head.next);
}
//iterative approach for searching element in linked list(Iterative)
public boolean searchElementItr(int key){
	Node temp = head;
	while(temp!=null){
		if(temp.data == key){
			return true;
		}
		temp = temp.next;
	}
	return false;
}
//recursive approach for searching element in  linked list(Recursion)
public boolean searchElementRec(Node head,int key){
	if(chkForEmpty(head)){
		return false;
	}
	if(head.data!=key){
		return searchElementRec(head.next,key);
	}
	return true;
}
//method to modify head of linked list
public void modifyHead(){
	if(chkForEmpty(head)){
		return;
	}
	head = head.next;
}
//swapping node function
public void swapNodes(int key1,int key2){
	if(chkForEmpty(head)){
		return;
	}
	Node temp = head;
	//key1 and key2 are same
	if(key1==key2){
		return;
	}
	
}
//reverse a linked list
public void reverseLinkedList(){
	if(chkForEmpty(head)){
		return;
	}
	Node prv = null;
	Node current = head;
	Node next = null;
	while(current != null){
		next = current.next;
		current.next = prv;
		prv = current;
		current = next;
	}
	head = prv;
}
//function to detect loop
public boolean detectLoop(){
	if(chkForEmpty(head)){
		return false;
	}
	Node slw=head;
	Node fast=head;
	while(slw!=null && fast!=null && fast.next!=null){
		slw = slw.next;
		fast = fast.next.next;
		if(slw.data == fast.data){
			return true;
		}
	}
	return false;
	
}
//to print linkedlist
public void printLinkedList(Node head){
	while(head!=null){
		System.out.print(head.data);
		if(head.next!=null){
			System.out.print("-->");	
		}
		head=head.next;
	}
}
//chk for empty linkedList
private boolean chkForEmpty(Node head){
	if(head == null){
		System.out.println("LinkedList is Empty");
		return true;
	}
	return false;
}
}
