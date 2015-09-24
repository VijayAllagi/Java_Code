package linkedlist;

public class MiddleNo {
	Node head ;
 void findMiddle(Node node){
	 Node slowMov  = node;
	 Node fastMov = node;
	 while(fastMov !=null && fastMov.next !=null){
		 fastMov = fastMov.next.next;
		 slowMov = slowMov.next;
	 }
	 System.out.println("Middle Element : "+ slowMov.data);
 }
 public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	ll.add(1); 
	ll.add(2);
	ll.add(3);
	ll.add(4);
	ll.add(5);
	MiddleNo md = new MiddleNo();
	md.findMiddle(ll.head);
}
}
