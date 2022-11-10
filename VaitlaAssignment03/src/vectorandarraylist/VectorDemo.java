/**
 * 
 */
package vectorandarraylist;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector names = new Vector(); 	 
		//Adding elements to vector
		names.addElement("Nikhila"); 
		names.addElement("Padma");
		// Traversing vector elements
		System.out.println("Name:"); 
		Enumeration enm = names.elements(); 
		while (enm.hasMoreElements()) { 
			System.out.println(enm.nextElement());
		}
	}

}
