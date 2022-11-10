/**
 * 
 */
package threadTypes;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class ThreadExampleDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting Main Thread...");
        ThreadExample th1 = new ThreadExample();

         Thread t = new Thread(th1);
         t.start();
         System.out.println("End of Main Thread...");
	}

}
