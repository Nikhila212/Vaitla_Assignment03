/**
 * 
 */
package constructor;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class FinalConstructor {
	public final String name;
	public final int age;
		
	public final FinalConstructor() {
		this.name = "Nikhila";
		this.age = 25;
	}
	
	public void display() {
	    System.out.println("Name of the Student: "+this.name );
	    System.out.println("Age of the Student: "+this.age );
	}
	
	public static void main(String args[]) {
		      new FinalConstructor().display();
	}


}
