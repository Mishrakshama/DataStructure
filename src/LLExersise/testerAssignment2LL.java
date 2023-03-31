package LLExersise;

public class testerAssignment2LL {
	 public static void main(String args[]) {

	        LinkedList linkedList = new LinkedList();
	        LinkedList reversedLinkedList = new LinkedList();
	            
	        linkedList.addAtEnd("Data");
	        linkedList.addAtEnd("Structures");
	        linkedList.addAtEnd("and");
	        linkedList.addAtEnd("Algorithms");
	            
	        System.out.println("Initial List");
	        linkedList.display();

	        System.out.println();
	            
	        reverseList(linkedList.getHead(), reversedLinkedList);
	        System.out.println("Reversed List");
	        reversedLinkedList.display();
	    }

	    public static void reverseList(Node head, LinkedList reversedLinkedList) {
	        //Implement your code here   
	    	 if (head == null) {
	             return;
	         }

	         reverseList(head.getNext(), reversedLinkedList);

	         if (reversedLinkedList.getHead() == null) {
	             reversedLinkedList.addAtEnd(head.getData());
	             reversedLinkedList.getHead().setNext(null);
	             reversedLinkedList.getTail().setNext(null);
	         } else {
	             Node node = new Node(head.getData());
	             reversedLinkedList.getTail().setNext(node);
	             node.setNext(null);
	             reversedLinkedList.setTail(node);
	         }
	     }
	    
}
