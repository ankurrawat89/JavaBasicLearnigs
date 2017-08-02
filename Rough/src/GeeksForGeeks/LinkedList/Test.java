package GeeksForGeeks.LinkedList;

public class Test {
public static void main(String args[]){
	LinkedListImpl linkedList = new LinkedListImpl();
	//insertion at beg
	linkedList.insertAtBeg(1);
	linkedList.insertAtBeg(2);
	linkedList.insertAtBeg(3);
	linkedList.insertAtBeg(4);
	linkedList.insertAtBeg(5);
	
	//insertion at last
	linkedList.insertAtLast(0);
	
	//insertion after given nodeData
	linkedList.insertAftrGvnNode(7,3);
	linkedList.insertAftrGvnNode(8,5);
	linkedList.insertAftrGvnNode(9,0);
	
	//trying to insert node after a given node which is not present in the linked list
	linkedList.insertAftrGvnNode(11,10);
	
	//printing linked kist before deletion
	System.out.println("Before Deletion : ");
	linkedList.printLinkedList(linkedList.head);
	
	//deleting node from a given position
	linkedList.deleteNode(4);
	
	//trying to delete node at a position which is not present in linked list
	linkedList.deleteNode(11);
	
	//deleting linked list after deletion
	System.out.println();
	System.out.println("After Deletion : ");
	linkedList.printLinkedList(linkedList.head);
	
	//printing linked list length using iterative approach
	System.out.println("\nLength of linked list is(Iterative) : "+linkedList.linkedListLengthItr());
	
	//printing linked list length using recursion approach
	System.out.println("Length of linked list is(Recursive) : "+linkedList.linkedListLengthRec(linkedList.head));
	
	//searching for element in linked list using iterative approach
	System.out.println("Element found in linked List(Iterative) : "+linkedList.searchElementItr(4));
		
	//searching for element in linked list using recursion approach
	System.out.println("Element found in linked List(Recursive) : "+linkedList.searchElementRec(linkedList.head,11));
	
	//modifying head of a linked list 
	System.out.println("Linked List after modifying its head : ");
	linkedList.modifyHead();
	linkedList.printLinkedList(linkedList.head);
	
	//Reversing the Linked List
	linkedList.reverseLinkedList();
	System.out.println("\nLinked List after reverse operation is performed  : ");
	linkedList.printLinkedList(linkedList.head);
	
	//Detect loop in linked list
	System.out.println("\nLoop present in Linked List  : "+linkedList.detectLoop());
	
	
}
}
