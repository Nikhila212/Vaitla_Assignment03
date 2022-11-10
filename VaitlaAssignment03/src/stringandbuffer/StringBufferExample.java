/**
 * 
 */
package stringandbuffer;

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
        StringBuffer sb= new StringBuffer("Example of StringBuffer");
        System.out.println(sb.toString());
        sb.reverse();
       System.out.println(sb.toString());
	}

}
