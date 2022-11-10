/**
 * 
 */
package vectorandarraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList names = new ArrayList();  
		names.add("Nikhila");
		names.add("Padmavathi"); 
 
		// Traversing ArrayList elements
		System.out.println("names:"); 
		Iterator itr = names.iterator(); 
		while (itr.hasNext()) 
			System.out.println(itr.next());
	}

}
