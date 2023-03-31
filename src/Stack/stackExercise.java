package Stack;

public class stackExercise {
	public static void main(String args[]) {
        
        Stack stack = new Stack(10);
        stack.push(15);
        stack.push(25);
        stack.push(30);
        stack.push(11);
            
        stack.display();
            
        if (checkTop(stack)) {
            System.out.println("The top most element of the stack is an even number");
        } else {
            System.out.println("The top most element of the stack is an odd number");
        }
    }

    public static boolean checkTop(Stack stack) {
    if(stack.peek()%2==0) {
    	return true;
    }
        return false;
    }
}
