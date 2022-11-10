/**
 * 
 */
package finaltypes;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class FinallyDemo {
	public static void main(String[] args) {
		try {    
	        System.out.println("Inside try block");  
	        int data=25/0;    
	        System.out.println(data);    
	      }   
	    catch (ArithmeticException e){  
	        System.out.println("Arithmetic Exception occurred "+ e);   
	      }     
	    finally {  
	        System.out.println("Inside finally block");  
	      }
	}
}
