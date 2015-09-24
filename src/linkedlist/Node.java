package linkedlist;

public class Node {
	int data;
	Node next=null;
	
	public Node(){
		super();
	}
	
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}


}
