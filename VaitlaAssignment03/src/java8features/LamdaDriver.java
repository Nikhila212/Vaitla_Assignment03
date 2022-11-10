/**
 * 
 */
package java8features;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class LamdaDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int side=5;  
        
        //with lambda  
        LamdaExpressionDemo l1=()->{  
            System.out.println("Display "+side);  
        };  
        l1.display();
	}

}
