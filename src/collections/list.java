package collections;

import java.util.ArrayList;

public interface list {
/**
 * @param args
 */
/**
 * @param args
 */
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add('a');
	a1.add(1);
	a1.remove('a');
	a1.addAll(a1);
	a1.indexOf(1);
	a1.lastIndexOf(10);
	a1.set(0, 10);
	
	a1.lastIndexOf(11);
	System.out.println(a1);
	Object a[] =a1.toArray();
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	System.out.println(a1);
	
	
}

	

	
	
}
