package collections;

import java.util.ArrayList;
import java.util.Collections;

public class array {
public static void main(String[] args) {

	ArrayList al=new ArrayList();

	
	al.add(99);
	al.addAll(7, al);
	al.remove(7);
	System.out.println(al);
	//Collections.swap(al, 0, 0);
	Collections.sort(al);
	for(Object obj:al) {
		System.out.println(al);
		//int a[]= {7,8,8,9,1,13,0,1};
	///	for(int i:a) {
	//]]		System.out.println(a);
		
	}
}
}
