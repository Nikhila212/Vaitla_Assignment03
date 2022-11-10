/**
 * 
 */
package overriding;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class ExceptionsExample extends OverridingSuper{
    public void sampleMethod() {
    System.out.println("Method of Subclass");
    }
    
    public static void main(String args[]) {
    ExceptionsExample obj = new ExceptionsExample();
    obj.sampleMethod();
   }
}
