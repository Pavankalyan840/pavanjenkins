package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class hastset {
	public static void main(String[] args) {
		
	
HashSet hs=new HashSet();
hs.add(1);
hs.add(2);
hs.add(2);
hs.add(3);
hs.add(4);
for (Object obj : hs) {
	System.out.println(obj);
}
System.out.println(hs);
ArrayList al=new ArrayList();
System.out.println("Arraylist"+hs);
System.out.println(al.get(1));
	}}
