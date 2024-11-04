/**
 * 
 */
package collections;

import java.util.TreeSet;

/**
 * @author Asus
 *
 */
public class treeset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		TreeSet ts=null;
		try {
			ts=new TreeSet();
			ts.add(1);
			ts.add(2);
			ts.add(3);
			ts.add(4);
			ts.add(5);
			ts.add("a");
			ts.add("Z");
			ts.add(null);
			ts.add(1);
			ts.add(2);
			ts.add(3);
			ts.add(4);
			ts.add(5);
			ts.add("a");
			ts.add("Z");
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}System.out.println(ts);
		}

}
