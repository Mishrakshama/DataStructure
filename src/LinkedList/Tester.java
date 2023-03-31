package LinkedList;

public class Tester {
	public static void main(String args[]){
		Linkedlist list = new Linkedlist();
		list.addAtEnd("Milan");
		list.addAtEnd("Venice");
		list.addAtEnd("Munich");
		list.addAtEnd("Vienna");
		list.addAtBeginning("beginning");
		System.out.println("Adding an element to the linked list");
		list.display();
		if (list.find("Munich") != null)
			System.out.println("Node found");
		else
			System.out.println("Node not found");
		System.out.println("List After insertion:");
		
		list.insert("inserted", "Venice");
		list.display();
		System.out.println("  ---------------");
		list.delete("Munich");
		list.display();
	}
}
