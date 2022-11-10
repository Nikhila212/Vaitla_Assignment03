/**
 * 
 */
package java8features;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class ForEachDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hocky");  
        System.out.println("forEach Method");  
        gamesList.forEach(games -> System.out.println(games));
	}

}
