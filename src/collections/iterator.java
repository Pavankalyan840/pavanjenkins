package collections;

import java.util.HashSet;
import java.util.Iterator;

public class iterator {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(1);
	hs.add(2);
	hs.add(3);
	hs.add(4);
	hs.add(4);
	hs.add('a');
	hs.add("a1");
	hs.add(null);
	hs.add('b');System.out.println("hastset"+hs);
	for (Object obj : hs) {
		System.out.println(obj);
	}
	Iterator it=hs.iterator();
	while(it.hasNext());
	System.out.println(it);
}
}
