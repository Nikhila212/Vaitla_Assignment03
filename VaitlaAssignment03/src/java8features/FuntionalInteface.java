/**
 * 
 */
package java8features;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class FuntionalInteface implements FunctionalInterfaceDemo{
	public void say(String msg){  
        System.out.println(msg);  
    }  
	
	public static void main(String[] args) {
		FuntionalInteface fl = new FuntionalInteface();  
        fl.say("Hello there");
	}

}
