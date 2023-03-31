package Array;

public class tester {
public static void main(String args[]) {
	char array[]= new char[7];
	array[0]='a';
	array[1]='b';
	array[2]='c';
	array[3]='d';
	array[4]='e';
	array[5]='f';
	arrInsertion.insert(array, 2, 'o');
	System.out.println("Insertion in an array");
	for(int i= 0; i<array.length;i++) {
		System.out.println(array[i]);
	}
	
	arrInsertion.delete(array, 2);
	System.out.println("Deletion in an array");
	for(int i= 0; i<array.length;i++) {
		System.out.println(array[i]);
	}
	
	
}
}
