/**
 * 
 */
package threadTwice;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class ThreadExampleDriver {
       public static void main(String[] args) {
		
		ThreadExample t1 = new ThreadExample();
 
		t1.start();
		//IllegalThreadStateException
		//t1.start();
       }
}
