package LinkedList;

public class Linkedlist {
private Node head;
private Node Tail;
public Node getHead() {
	return head;
}
public Node getTail() {
	return Tail;
}
public void addAtEnd(String data) {
	Node node= new Node(data);
	if(this.head==null) {
		this.head=this.Tail=node;
	}
	else {
		this.Tail.setNext(node);
		this.Tail=node;
	}
}

public void addAtBeginning(String data) {
	// Create a new node
	Node node = new Node(data);

	// Check if the list is empty,
	// if yes, make the node as the head and the tail
	if (this.head == null)
		this.head = this.Tail = node;
	else {
		// If the list is not empty, add the element at the beginning
		node.setNext(this.head);
		// Make the new node as the head
		this.head = node;
	}
}

public void display() {
	// Initialize temp to the head node
	Node temp = this.head;
	// Traverse the list and print data of each node
	while (temp != null) {
		System.out.println(temp.getData());
		temp = temp.getNext();
	}
}


public Node find(String data) {
	Node temp = this.head;
	// Traverse the list and return the node
	// if the data of it matches with the searched data
	while (temp != null) {
		if (temp.getData().equals(data))
			return temp;
		temp = temp.getNext();
	}
	return null;
}

public void insert(String data, String dataBefore) {
	Node node= new Node(data);
	if(this.head==null) {
		this.head=this.Tail=node;
	}
	else {
		Node nodeBefore= this.find(dataBefore);
		if(nodeBefore!=null) {
			node.setNext(nodeBefore.getNext());
			nodeBefore.setNext(node);
			if(nodeBefore==this.Tail)
				this.Tail=node;
		}
		else
			System.out.println("node not found");
	}
}

/*delete(data):
1. Find the node with the given data. If found,
   a. If the node to be deleted is head node, make the next node as head node
      i.   If it is also the tail node, make the tail node as null
   b. Otherwise,
      i.   Traverse till the node before the node to be deleted, call it nodeBefore
      ii.  Make link of nodeBefore refer to link of node to be deleted.
      iii. If the node to be deleted is the tail node, call the nodeBefore as tail node
      iv.  Make the link of the node to be deleted as null
2. If the node to be deleted is not found, display appropriate error message
*/

public void delete(String data) {
	if(this.head==null) {
		System.out.println("List is empty");
	}
	else {
		Node node=this.find(data);
		if(node==null) {
			System.out.println("Node not found");
		}
		else if(node== this.head) {
			this.head = this.head.getNext();
			node.setNext(null);
		if(node == this.Tail);
		Tail=null;
		}
		else {
			Node nodeBefore = null;
			Node temp = this.head;
			while (temp != null) {
				if (temp.getNext() == node) {
					nodeBefore = temp;
					break;
				}
				temp = temp.getNext();
			}
			nodeBefore.setNext(node.getNext());
			if (node == this.Tail)
				this.Tail = nodeBefore;
			node.setNext(null);
		}
	}
}
}
