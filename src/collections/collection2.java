package collections;

import java.util.ArrayList;
import java.util.Collections;

public class collection2 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(1);
	a1.add(2);
	a1.add(3);
	a1.add(4);
	a1.add(5);
	ArrayList a2=new ArrayList(a1 );

Collections.swap(a1, 6, 7);
System.out.println(a1);
Collections.sort(a1);
System.out.println(a1);
Collections.shuffle(a1);
System.out.println(a1);
Collections.reverse(a1);
System.out.println(a1);

	
}
}
