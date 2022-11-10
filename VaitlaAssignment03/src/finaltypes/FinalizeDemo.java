/**
 * 
 */
package finaltypes;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class FinalizeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeDemo str = new FinalizeDemo();
		str = null;
		System.gc();
		System.out.println("Output in main method");
	}	
	@Override
	protected void finalize() {
		System.out.println("Output in finalize method");
	}
}
