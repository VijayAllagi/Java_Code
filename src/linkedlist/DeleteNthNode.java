package linkedlist;

public class DeleteNthNode {
  public void deleteNode(Node nNode){
	  if(nNode == null){
		  return ;
	  }
	  else {
		  Node prev = nNode ;
		  nNode = nNode.next;
		  while(nNode.next == null){
			  prev.data = nNode.data;
			  prev.next = nNode.next;
			  nNode = nNode.next;
		  }
		  prev.next = null;
	  }
  }
  public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(1); 
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
        DeleteNthNode del = new DeleteNthNode();
        Node nNode = ll.head.getNext();
        del.deleteNode(nNode);
        ll.printLinkedList(ll.head);
	}
}
