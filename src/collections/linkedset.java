package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class linkedset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();

		hs.add(1);
hs.add(null);
hs.add(2);
hs.add("java");
hs.add(3);
hs.add(8);
hs.add(4);
hs.add(5);
hs.add(6);
hs.add(7);
hs.add(1);
hs.add(null);
hs.add(2);
hs.add("java");
hs.add(3);
System.out.println(hs);
LinkedHashSet ls=new LinkedHashSet();
ls.add(1);
ls.add(null);
ls.add(2);
ls.add("java");
ls.add(3);
ls.add(8);
ls.add(4);
ls.add(5);
ls.add(6);
ls.add(7);
ls.add(1);
ls.add(null);
ls.add(2);
ls.add("java");
ls.add(3);
System.out.println("linkedhashset"+ls);
	}

}
