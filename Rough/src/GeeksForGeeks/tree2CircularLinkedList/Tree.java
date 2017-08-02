package GeeksForGeeks.tree2CircularLinkedList;

public class Tree {
	
TreeNode rootNode,tn1,tn2,tn3,tn4,tn5,tn6,tn7,tn8,tn9,tn10,tn11,tn12,tn13,tn14,tn15,tn16;
Tree(){
	
	tn16 = new TreeNode(null, -1, null, tn15, false);
	tn14 = new TreeNode(null, -4, null, tn13, false);
	tn15 = new TreeNode(null, -2, tn16, tn13, false);
	tn13 = new TreeNode(tn14, -3, tn15, tn11, false);
	tn11 = new TreeNode(null, -5, tn13, tn8, false);
	tn12 = new TreeNode(null, 1, null, tn8, false);
	tn10 = new TreeNode(null, 8, null, tn6, false);
	tn8 = new TreeNode(tn11, 0, tn12, tn4, false);
	tn9 = new TreeNode(null, 3, null, tn4, false);
	tn6 = new TreeNode(null, 7, tn10, tn3, false);
	tn7 = new TreeNode(null, 10, null, tn3, false);
	tn3 = new TreeNode(tn6, 9, tn7, tn1, false);
	tn4 = new TreeNode(tn8, 2, tn9, tn2, false);
	tn5 = new TreeNode(null, 5, null, tn2, false);
	tn2 = new TreeNode(tn4, 4, tn5, tn1, false);
	tn1 = new TreeNode(tn2, 6, tn3, null, false);
	setParent();
    rootNode = tn1;
}
public void setParent(){
	tn16.parentNode = tn15;
	tn14.parentNode = tn13;
	tn15.parentNode = tn13;
	tn13.parentNode = tn11;
	tn11.parentNode = tn8;
	tn12.parentNode = tn8;
	tn10.parentNode = tn6;
	tn8.parentNode = tn4;
	tn9.parentNode = tn4;
	tn6.parentNode = tn3;
	tn7.parentNode = tn3;
	tn3.parentNode = tn1;
	tn4.parentNode = tn2;
	tn5.parentNode = tn2;
	tn2.parentNode = tn1;
}
}
