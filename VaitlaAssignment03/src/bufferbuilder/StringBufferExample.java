/**
 * 
 */
package bufferbuilder;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class StringBufferExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuffer a= new StringBuffer("Example");
        System.out.println(a.toString());
         //updating the string
         a.append(" to StringBuffer");
        System.out.println(a.toString());
	}

}
