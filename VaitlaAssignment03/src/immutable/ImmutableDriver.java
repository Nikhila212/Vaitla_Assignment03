/**
 * 
 */
package immutable;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class ImmutableDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Immutable obj = new Immutable("Nikhila", 25);

	    System.out.println("Name: " + obj.getName());
	    System.out.println("Date: " + obj.getAge());
	}

}
