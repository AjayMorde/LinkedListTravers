package linkedList;
class Node {
	
	int data;
	Node next;
	
	
       Node(int x){
    	   this.data=x;
    	   next=null;
       }                 
}

public class TraversLinkedList {
	

	public static void printList(Node head) {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			 curr=curr.next;
			
		}
		System.out.println(" ");
	}
	
	
	public static void main(String[] args) {
		Node head=new Node(1);
		 head.next=new Node(2);
		 head.next.next=new Node(3);
		printList(head); 
		
	
	}
	
	
	

}
