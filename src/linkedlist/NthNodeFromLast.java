package linkedlist;
//Finding Nth node from the end of a Linked List
public class NthNodeFromLast {
 void nthNode(Node head,int n){
	 int count=0;
	 if(head == null)
	 {
		 System.out.println("Head is null");
		 return ;
	 }
	 Node temp =head;
	 while(temp != null){
		 temp = temp.next;
		 count++;
	 }
	 if(n>count){
		 System.out.println("N is greater than number elements");
	 }
	 else{
		 Node temp2 = head;
		 int j=1;
		 count = count - n+1;
		 while(j < count){
			 temp2 = temp2.next;
			 j++;
		 }
		 System.out.println(temp2.data);
	 }
		 
	 
	 
 }
 public static void main(String[] args) {
	 //1->2->3->4->5
	LinkedList ll = new LinkedList();
	ll.add(1); 
	ll.add(2);
	ll.add(3);
	ll.add(4);
	ll.add(5);
	NthNodeFromLast md = new NthNodeFromLast();
	md.nthNode(ll.head, 2);
}
}
