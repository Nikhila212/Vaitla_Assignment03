/**
 * 
 */
package hashDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> names = new HashMap<String,String>();
		names.put("Nikki", "Nikhila");
		names.put("Paddu", "Padmavathi");
		names.put("Samyu", "Samyuktha");
		names.put("Anu", null);
		names.put(null, null);
		names.put(null, "Harry");
		
		System.out.print("Elements in Hashtable are:\n " + names.entrySet());
		System.out.println(names.get("Nikki"));
		System.out.println(names.get("Anu"));
	}

}
