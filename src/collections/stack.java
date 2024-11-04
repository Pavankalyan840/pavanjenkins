package collections;

import java.util.Stack;

public class stack {
public static void main(String[] args) {
	Stack s=new Stack();
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	s.push(5);System.out.println(s);
	
	System.out.println("pop of operaction"+s.pop());

	System.out.println("peek of operaction"+s.peek());
	System.out.println("serach of operaction"+s.search(6));
	System.out.println(s.push(s));
	//System.out.println(s);
}
}
