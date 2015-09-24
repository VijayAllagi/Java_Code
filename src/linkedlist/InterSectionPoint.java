package linkedlist;

public class InterSectionPoint {
 public static void findIntersect(LinkedList a, LinkedList b){
	 int counta = findCount(a.head);
	 int countb = findCount(b.head);
	 System.out.println("dd"+ counta);
	 int d = Math.abs(counta-countb);
	 if(counta > countb){
		 System.out.println("Intersection Node:" + intersect(a.head,b.head,d));
	 }
	 else {
		 System.out.println("Intersection Node:"+ intersect(b.head,a.head,d));
	 }
	 
 }

private static int intersect(Node a, Node b, int d) {
  for(int i =0;i<d ;i++){
	  if(a == null){ return -1 ;} 
	  a = a.next;
  }
  while(a!=null && b != null){
   if(a == b) return a.data; 	
   a = a.next;
   b = b.next;
  }
  return -1;
	
}

private static int findCount(Node n) {
	// TODO Auto-generated method stub
	if(n == null){
		return 0;
	}
	else {
		int count  =0;
		while(n != null){
			count++;
			n = n.next;
		}
		return count;
	}
	
}
public static void main(String[] args) {
	//Two Linked lists
	LinkedList ll = new LinkedList();
	LinkedList l2 = new LinkedList();
	
	//Create the indidual nodes and add it linked list
    Node Head1 = new Node(1,null);
	Node Head2 = new Node(5,null);
	System.out.println("Start of the main");

	Node Elm1 = new Node(1,null);
	Node Elm2 = new Node(5,null);
	Node Elm3 = new Node(1,null);
	Node Elm1Linked2 = new Node(2,null);
	//Ll addition
	//Ll    1->1->5->1
	//L2 5->2->1->5->1
	ll.insertLast(Head1);
	ll.insertLast(Elm1);
	ll.insertLast(Elm2);
	ll.insertLast(Elm3);
	ll.printLinkedList(ll.head);
	//L2 addition
	l2.insertLast(Head2);
	l2.insertLast(Elm1Linked2);
	l2.insertLast(Elm1);
	l2.printLinkedList(l2.head);

	InterSectionPoint.findIntersect(ll,l2);
	
}
}
