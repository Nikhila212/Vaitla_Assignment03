/**
 * 
 */
package java8features;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class DefaultMethods implements Default {
	@Override
	public void sayMore(String msg) {
		System.out.println(msg); 
	}
	
	 public static void main(String[] args) {  
	        DefaultMethods dm = new DefaultMethods();  
	        dm.say();   // calling default method  
	        dm.sayMore("Assignment 03 for practice");  // calling abstract method  
	 }
}
