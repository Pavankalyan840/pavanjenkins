package collections;

import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v=new Vector();
 v.add(1);
 v.add(2);
 v.add(3);
 v.add(4);
 v.add(5);
 v.add(6);
 v.add(7);
 v.add(8);
 v.add(9);
 v.add(0);
 
 System.out.println(v);
 v.addElement(7);
 System.out.println(v);
 v.removeElement(3);
 System.out.println(v);
 v.removeElementAt(7);
 System.out.println(v);
 //v.removeAllElements();
 v.firstElement();
 System.out.println(v);
 v.lastElement();
 System.out.println(v);
 v.capacity();
v.elements();
System.out.println(v);
	}

}
