package collections;

import java.util.HashMap;

public class map {

	public static void main(String[] args) {
		int[] a=new int[1];
		HashMap hm=new HashMap();
		hm.put(1, "java");
		hm.put("jaba", 0);
		hm.put(3, 4);
		System.out.println(hm);
		System.out.println(hm.get("jaba"));
		System.out.println(hm.containsKey(3));
		System.out.println(hm.containsValue("java"));
		System.out.println(hm.remove(4));System.out.println(hm);
		System.out.println(hm.containsValue(4));System.out.println(hm);
	}

}
