package collections;

import java.util.LinkedList;

public class likedlist {

	public static void main(String[] args) {
		LinkedList a1=new LinkedList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		System.out.println(a1);
		a1.get(40);
		System.out.println(a1);
		a1.getFirst();
		a1.getLast();		System.out.println(a1);
		
		a1.remove(1);		System.out.println(a1);
		a1.addFirst(1);
		a1.addLast(6);
		System.out.println(a1);
	}

}
