/*    A  program demonstrating the operation of vector member functions*/
import java.util.*;
import java.util.Vector;
public class testVectors {

	public static void main(String[] args) {
	Vector v1= new Vector();     //v1=[], size=0,capacity=10
	for (int j= 1; j<=5; j++ ) {
		v1.addElement(new Integer(j)); //vi=[1,2,3,4,5],size=5
	}
	System.out.println("v1= "+v1);
	Integer i= new Integer(3);
	System.out.println(v1.indexOf(i)+" "+v1.indexOf(i, 4));  //2 -1
	System.out.println(v1.contains(i)+" "+v1.lastIndexOf(i)); //true 2
	Vector v2= new Vector(3,4);            //v2=[], size=0,capacity=3
	for(int j=4; j<=8;j++) {
		v2.addElement(new Integer(j));     //v2=[4,5,6,7,8], size=5, capacity= 7
	}
		v2.ensureCapacity(9);             //v2=[4,5,6,7,8], size=5, capacity= 11
		Vector v3= new Vector(2);        //v3=[],size=0, capacity=2
		v3.setSize(4);                   //v2=[null,null,null,null],size=cap=4
		v3.setElementAt(new Integer(9), 1);//v3=[null,null,null,9]
		v3.setElementAt(new Integer(5), 3);//v3=[null,5,9,null,5]
		v3.insertElementAt(v3.elementAt(3), 1);//v3=[null,5,9,null,5],size=5, cap=8
		v3.ensureCapacity(9);                  //v3= [null,5,9,null,5], size=5,cap=16
       
		v3.removeElement(new Integer(9));     //v3=[null,5,null,5]
		v3.removeElementAt(v3.size()-2);      //v3= [null,5,5]
        java.util.Enumeration ev= v3.elements();
        while(ev.hasMoreElements()) {
        	System.out.println(ev.nextElement()+" ");
        }
        System.out.println();
        v3.removeElementAt(0); //v3=[5,5]
        v3.addAll(v1);        //v3=[5,5,1,2,3,4,5]
        v3.removeAll(v2);     //v3=[1,2,3]=v3-v2
        v3.add(2, v1);        //v3=[1,2,1,2,3,4,5,3]
        v3.retainAll(v2);     //v3=[4,5]= intersection(v2,v3)
        v1.subList(1, 3).clear(); //v1=[1,4,5]
        Vector v4= new Vector(),v5;
    //    v4.addElement(new Node("abc",23));
        v5= (Vector) v4.clone(); //v4=
   //     ((Node)v5.firstElement()).age=34;
    }

}
