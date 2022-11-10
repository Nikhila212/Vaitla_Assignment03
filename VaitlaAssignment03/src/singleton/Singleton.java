/**
 * 
 */
package singleton;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public static class Singleton {
	   private static Singleton instance = null;

	   private Singleton() {}

	   public static synchronized Singleton getInstance() {
	       if (instance == null) {
	           instance = new Singleton();
	       }

	       return instance;

	   }
}
