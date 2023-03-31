package Stack;

public class Stack {
private int top;
private int maxsize;
private int[] arr;

Stack(int maxsize){
	this.top=-1;
	this.maxsize=maxsize;
	arr=new int[maxsize];
	}
public boolean isFull() {
	if (top>=(maxsize-1)) {
		return true;
	}
	return false;
}
public boolean isEmpty() {
	if (top<0) {
		return true;
	}
	return false;
}
public int pop() {
	if (isEmpty())
		return Integer.MIN_VALUE;
	else
		return arr[top--];
}
public boolean push(int data) {
	if(isFull()) {
		return false;
	}
	else {
		arr[++top]= data;
		return true;
	}	
}
public int peek() {
	if(top<0) {
	return Integer.MIN_VALUE;	
}
	else return arr[top];
}

public void display() {
	System.out.println("displaying all values of stack");
	for(int i=top; i>=0; i--) {
		System.out.println(arr[i]);
	}
}
public static void main(String[] args) {
	Stack st= new Stack(4);
	System.out.println("stack created");
	if(st.push(1)) {
		System.out.println("Data is pushed");
		}
		else {
			System.out.println("stack is full");
		
	}
	if(st.push(2)) {
		System.out.println("Data is pushed");
		}
		else {
			System.out.println("stack is full");
		
	}
	if(st.push(3)) {
		System.out.println("Data is pushed");
		}
		else {
			System.out.println("stack is full");
		
	}
	if(st.push(4)) {
		System.out.println("Data is pushed");
		}
		else {
			System.out.println("stack is full");
		
	}
	if(st.push(5)) {
		System.out.println("Data is pushed");
		}
		else {
			System.out.println("stack is full");
		
	}
	st.display();
	System.out.println("The top element is : " + st.peek());
	int poppedElement = st.pop();
	if (poppedElement == Integer.MIN_VALUE)
		System.out.println("Stack is empty\n");
	else
		System.out.println("The element popped out is : " + poppedElement + "\n");
	poppedElement = st.pop();
	if (poppedElement == Integer.MIN_VALUE)
		System.out.println("Stack is empty\n");
	else
		System.out.println("The element popped out is : " + poppedElement + "\n");
	poppedElement = st.pop(); if (poppedElement == Integer.MIN_VALUE)
		System.out.println("Stack is empty\n");
	else
		System.out.println("The element popped out is : " + poppedElement + "\n");
	poppedElement = st.pop(); if (poppedElement == Integer.MIN_VALUE)
		System.out.println("Stack is empty\n");
	else
		System.out.println("The element popped out is : " + poppedElement + "\n");
	poppedElement = st.pop();
	if (poppedElement == Integer.MIN_VALUE)
		System.out.println("Stack is empty\n");
	else
		System.out.println("The element popped out is : " + poppedElement + "\n");
}
}
