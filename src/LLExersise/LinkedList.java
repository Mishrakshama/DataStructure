package LLExersise;

public class LinkedList {
	  private Node head;
		private Node tail;

		public Node getHead() {
			return this.head;
		}

		public Node getTail() {
			return this.tail;
		}
		public void setHead(Node head) {
		    this.head = head;
		}

		public void setTail(Node tail) {
		    this.tail = tail;
		}

		public void addAtEnd(String data) {
			Node node = new Node(data);

			if (this.head == null) {
				this.head = this.tail = node;
			} else {
				this.tail.setNext(node);
				this.tail = node;
			}
		}

		public void addAtBeginning(String data) {
			Node node = new Node(data);

			if (this.head == null) {
				this.head = this.tail = node;
			}

			else {
				node.setNext(this.head);
				this.head = node;
			}
		}

		public void display() {
			Node temp = this.head;

			while (temp != null) {
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
		}

		public Node find(String data) {
			Node temp = this.head;

			while (temp != null) {
				if (temp.getData().equals(data))
					return temp;
				temp = temp.getNext();
			}
			return null;
		}

		public void insert(String data, String dataBefore) {
			Node node = new Node(data);

			if (this.head == null)
				this.head = this.tail = node;
			else {
				Node nodeBefore = this.find(dataBefore);
				if (nodeBefore != null) {
					node.setNext(nodeBefore.getNext());
					nodeBefore.setNext(node);
					if (nodeBefore == this.tail)
						this.tail = node;
				} else
					System.out.println("Node not found");
			}
		}

		public void delete(String data) {

			if (this.head == null)
				System.out.println("List is empty");
			else {
				Node node = this.find(data);

				if (node == null)
					System.out.println("Node not found");

				if (node == this.head) {
					this.head = this.head.getNext();
					node.setNext(null);

					if (node == this.tail)
						tail = null;
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

					if (node == this.tail)
						this.tail = nodeBefore;
					node.setNext(null);
				}
			}
		}
}
