package linkedlist;

public class reverseLink {
   Node reverse(Node current){
	  Node prev = null;
	  Node next ;
	  while(current != null){
		  next = current.next;
		  current.next = prev;
		  prev = current;
		  current = next;
	  }
	  return prev;
  }
	public static void main(String[] args) {
		//1->2->3->4->5
		LinkedList ll = new LinkedList();
		ll.add(1); 
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		//ll.add(6);
		reverseLink revx = new reverseLink();
		ll.head= revx.reverse(ll.head);
		ll.printLinkedList(ll.head);
	}
}
