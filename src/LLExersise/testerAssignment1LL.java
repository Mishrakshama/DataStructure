package LLExersise;

public class testerAssignment1LL {
	 public static void main(String args[]) {
	        LinkedList linkedList1 = new LinkedList();
	        linkedList1.addAtEnd("ABC");
	        linkedList1.addAtEnd("DFG");
	        linkedList1.addAtEnd("XYZ");
	        linkedList1.addAtEnd("EFG");
	            
	        LinkedList linkedList2 = new LinkedList();
	        linkedList2.addAtEnd("ABC");
	        linkedList2.addAtEnd("DFG");
	        linkedList2.addAtEnd("XYZ");
	        linkedList2.addAtEnd("EFG");
	            
	        System.out.println("Initial List");
	        linkedList1.display();

	        System.out.println("\nList after left shifting by 2 positions");
	        shiftListLeft(linkedList1, 2);
	        linkedList1.display();
	            
	        System.out.println("\nInitial List");
	        linkedList2.display();
	            
	        System.out.println("\nList after right shifting by 2 positions");
	        shiftListRight(linkedList2, 2);
	        linkedList2.display();
	    }

	    public static void shiftListLeft(LinkedList linkedList, int n) {
	    	 if (linkedList == null || linkedList.getHead() == null) {
	    	        return;
	    	    }
	    	    int len = 0;
	    	    Node node = linkedList.getHead();
	    	    while (node != null) {
	    	        len++;
	    	        node = node.getNext();
	    	    }

	    	    // If n is greater than or equal to the length of the linked list, do nothing
	    	    if (n >= len) {
	    	        return;
	    	    }

	    	    // Left shift the linked list
	    	    Node tail = linkedList.getTail();
	    	    tail.setNext(linkedList.getHead());
	    	    node = linkedList.getHead();
	    	    for (int i = 0; i < n - 1; i++) {
	    	        node = node.getNext();
	    	    }
	    	    linkedList.setHead(node.getNext());
	    	    node.setNext(null);
	    	    linkedList.setTail(node);

	    }

	    public static void shiftListRight(LinkedList linkedList, int n) {
	        //Implement your code here   
	    	  if (linkedList == null || linkedList.getHead() == null) {
	    	        return;
	    	    }

	    	    // Calculate the length of the linked list
	    	    int len = 0;
	    	    Node node = linkedList.getHead();
	    	    while (node != null) {
	    	        len++;
	    	        node = node.getNext();
	    	    }

	    	    // If n is greater than or equal to the length of the linked list, do nothing
	    	    if (n >= len) {
	    	        return;
	    	    }

	    	    // Right shift the linked list
	    	    Node tail = linkedList.getTail();
	    	    tail.setNext(linkedList.getHead());
	    	    node = linkedList.getHead();
	    	    for (int i = 0; i < len - n - 1; i++) {
	    	        node = node.getNext();
	    	    }
	    	    linkedList.setHead(node.getNext());
	    	    node.setNext(null);
	    	    linkedList.setTail(node);

	    }
}
