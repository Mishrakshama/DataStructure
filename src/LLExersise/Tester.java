package LLExersise;

public class Tester {
	public static void main(String args[]) {
        
	    LinkedList linkedList = new LinkedList();
	    linkedList.addAtEnd("AB");
	    linkedList.addAtEnd("BC");
	    linkedList.addAtEnd("CD");
	    linkedList.addAtEnd("DE");
	    linkedList.addAtEnd("EF");

	    String elementToBeFound = "CD";
	    int position = findPosition(elementToBeFound, linkedList.getHead());
	    if (position != 0)
	        System.out.println("The position of the element is " + position);
	    else
	        System.out.println("The element is not found!");
	 }

	 public static int findPosition(String element, Node head) {
		 Node current = head;
		    int position = 1;
		    while (current != null) {
		        if (current.getData().equals(element)) {
		            return position;
		        }
		        current = current.getNext();
		        position++;
		    }
		    return 0;       
	 }
}
