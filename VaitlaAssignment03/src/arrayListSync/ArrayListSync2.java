/**
 * 
 */
package arrayListSync;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class ArrayListSync2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<String>();
		names.add("Nikhila");
		names.add("Harry");
		names.add("Selena");
    System.out.println("Elements of synchronized ArrayList :");

    Iterator<String> itr = names.iterator();
    while (itr.hasNext())
        System.out.println(itr.next());
	}

}
