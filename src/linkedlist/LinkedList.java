package linkedlist;


import java.util.HashMap;

public class LinkedList {

	Node head;

	// insert rearend
	void insertLast(int v) {
		Node tempNode = new Node();
		tempNode.setData(v);
		if (head == null)
			head = tempNode;
		else {

			Node curr = head;
			while (curr.getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(tempNode);
		}
	}
	//Node addition
	void insertLast(Node tempNode) {
		if (head == null)
			head = tempNode;
		else {

			Node curr = head;
			while (curr.getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(tempNode);
		}
	}
	// insert front end

	void insertfrontend(int val) {
		Node tempNode = new Node();
		tempNode.setData(val);
		tempNode.setNext(head);
		head = tempNode;

	}

	// insert specific position
	void insertposition(int val, int pos) {
		int c = 1;
		Node temp1 = new Node();
		temp1.setData(val);

		int lengthlist = 1;
		// ListNode length=head;
		// while(head!=null && )
		if (head == null) {
			head = temp1;
		}

		else if (pos == 1) {
			temp1.setNext(head);
			head = temp1;
		} else {
			Node temp2 = head;
			while (c != pos - 1 && temp2.getNext() != null) {
				temp2 = temp2.getNext();
				c++;
			}
			if (c != pos - 1)
				System.out.println("cannot insert here position wrong" + c);
			else {
				temp1.setNext(temp2.getNext());
				temp2.setNext(temp1);
			}
		}

	}

	void delete(int v) {

		Node del = head;
		Node prev = null;
		// System.out.println(del.getData());

		while (del.getData() != v) {

			del.getNext();
			prev = del;
		}
		System.out.println(del.getData() + " v value:" + v);
		prev.setNext(del.getNext());

	}

	void add(int v) {
		Node p = new Node();
		p.setData(v);
		if (head == null)
			head = p;
		else {
			Node q = head;
			while (q.getNext() != null) {
				q = q.getNext();
			}
			q.setNext(p);
		}
	}

	void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();

		}
		// reverse2(head);
	}

	// swap the 2 nodes only

	void swapnode() {
		Node temp = head;
		Node temp2 = head.getNext();
		head = head.getNext();
		// System.out.println("Display:"+temp.getData()+" "+temp2.getData());

		temp.setNext(temp2.getNext());
		temp2.setNext(temp);

		/*
		 * ListNode next=head.getNext(); ListNode curr=head;
		 * head=head.getNext(); curr.setNext(next.getNext());
		 * next.setNext(curr);
		 */

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
	// data sorted order

	void sortdata() {
		Node i;// =head;
		Node j;// =head.getNext();
		Node temp3 = head;

		for (i = head; i != null; i = i.getNext()) {
			for (j = i.getNext(); j != null; j = j.getNext()) {
				if (i.getData() > j.getData()) {
					int d1 = i.getData();
					// d1=i.getData();
					int d2 = j.getData();
					i.setData(d2);
					// System.out.println("value:"+i.getData());
					j.setData(d1);
					// System.out.println("value:"+j.getData());

				}
				// temp2=temp2.getNext();
			}
			// temp=temp.getNext();
		}

	}

	void reverse() {

		Node prev = null;
		Node cur = head;
		Node next = cur.getNext();

		while (cur != null) {
			cur.setNext(prev);
			prev = cur;
			cur = next;
			if (next != null)
				next = cur.getNext();
		}
		head = prev;

	}

	void reverse2(Node curr) {
		// curr == null
		if (curr.next == null) {
			head = curr;
			return;
		}
		reverse2(curr.next);
		curr.next.next = curr;
		curr.next = null;
	}

	void swap4node() {
		Node prev = null;
		Node cur = head;
		Node next = cur.getNext();
		while (cur != null) {
			cur.setNext(next.getNext().getNext());
			prev = next;
			prev.setNext(cur);
			next.getNext().setNext(null);
			cur = cur.next;

		}
	}

	// queue FIFO
	void duplicate() {
		Node cur = head;
		HashMap h = new HashMap();
		int data1 = 0;
		int dat2 = 0;
		Node prev = null;
		while (cur != null) {

			data1 = cur.getData();
			if (h.containsKey(data1)) {

				/*
				 * prev=cur; if(prev.getNext()==null) {
				 * 
				 * }
				 */
				prev.setNext(cur.getNext());
				cur = cur.getNext();
			} else {
				h.put(data1, h.get(data1 + 1));
				System.out.println("inserted elements:" + data1);
				prev = cur;
				cur = cur.getNext();
			}
		}
	}

}
