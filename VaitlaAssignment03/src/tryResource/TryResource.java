/**
 * 
 */
package tryResource;

import java.io.File;
import java.util.Scanner;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class TryResource {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(new File("sample.txt")); ) {
		      while (scan.hasNext()) {
		        System.out.println(scan.nextLine());
		      }
		    } catch (Exception e){
		       System.out.println("FilenotFound Exception is thrown" + e);
		       }
	}

}
