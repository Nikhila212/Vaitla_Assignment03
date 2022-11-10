/**
 * 
 */
package hashDemo;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class HashtableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> names = new Hashtable<String,String>();
		names.put("Nikki", "Nikhila");
		names.put("Paddu", "Padmavathi");
		names.put("Samyu", "Samyuktha");
		names.put("Anu", null);
		
		System.out.print("Elements in Hashtable are:\n " + names.entrySet());
		System.out.println(names.get("Nikki"));
		//System.out.println(names.get("Anu"));//Exception
	}

}
