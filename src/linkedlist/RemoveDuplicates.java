/**
 * 
 */
package linkedlist;

import java.util.HashSet;
import linkedlist.LinkedList;


/**
 * @author VijayAllagi
 *
 */
public class RemoveDuplicates {

	    public static void removeDuplicates(Node head){
	 
	        HashSet<Integer> linkListItems = new HashSet<Integer>();
	 
	        Node tempNode = head;
	        
	        if(head == null){
	           return;
	          }
	        else{
	          //Add the head to  hashset
	        	linkListItems.add(head.data);
	        }
	 
	        // Iterate throgh the linked list and add it to hashset if not present
	        while(tempNode != null && tempNode.next != null){
	            // if next node is a duplicate node
	            if(linkListItems.contains(tempNode.next.data)){
	 
	                //Go to next node
	                tempNode.next = tempNode.next.next;
	              }
	            else{
	               // add next node data to hash
	            	linkListItems.add(tempNode.next.data);
	               tempNode = tempNode.next;
	            }
	        }
	    }
	    public static void main(String[] args) {
	    	//Head Node in Linked list 1 is
	        //LL is 1-2-3-4-5-1-2
	    	LinkedList ll = new LinkedList();
			ll.add(1); 
			ll.add(2);
			ll.add(3);
			ll.add(4);
			ll.add(5);
			ll.add(1); 
			ll.add(2);
			RemoveDuplicates rdObj = new RemoveDuplicates();
			rdObj.removeDuplicates(ll.head);
			ll.printLinkedList(ll.head);
			
		}
}
