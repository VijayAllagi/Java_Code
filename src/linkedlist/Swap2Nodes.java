package linkedlist;

public class Swap2Nodes {
	//void swap2Node(Node curr){}
	Node swap(Node head){
		Node prev=null;
		Node curr=head;Node a,b;
		while(curr!=null && curr.next != null)
		{   
			a=curr;
			b=curr.next;
			if(prev!=null)
			{   prev.next=b;
			//System.out.println("b value"+ b.data);
			}
			else
			{
		    //Only once head is set
			head=b;
			System.out.println(head.data);
			}
			a.next=b.next;
			b.next=a;
			prev=a;
			curr=a.next;

		}
		return head;
	}
	void printLinkedList(Node head){
		if(head == null)
		{return ;
		}
		else {
			while(head !=null){
				System.out.print(head.data+ " ");
				head = head.next;
			}
			System.out.println();
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
		//ll.add(6);
		Swap2Nodes swapObj = new Swap2Nodes();
		//swapObj.swap2Node(ll.head);
		ll.head = swapObj.swap(ll.head);
		swapObj.printLinkedList(ll.head);

	}
}
