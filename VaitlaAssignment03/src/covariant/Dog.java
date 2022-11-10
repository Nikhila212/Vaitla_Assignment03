/**
 * 
 */
package covariant;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class Dog extends Animal{
	
	public Dog getDetails(){ 
	    System.out.println("Hello, this is the subclass"); 
	     return this; 
	  } 
	  
	  public void sound() {
		  System.out.println("Dog is barking");
	  }
}
