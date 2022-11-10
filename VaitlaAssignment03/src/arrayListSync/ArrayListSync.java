/**
 * 
 */
package arrayListSync;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class ArrayListSync {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		names.add("Adrian");
		names.add("Robert");
		names.add("Harry");
		names.add("Potter");
		
		names = Collections.synchronizedList(names);
		synchronized(names) {
			Iterator<String> itr = names.listIterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}

}
