/**
 * 
 */
package generics;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class GenericClassPractice<T> {
	private T name;

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "name= " + name;
	}

	public static void main(String[] args) {
		GenericClassPractice g1 = new GenericClassPractice();
		g1.setName("Nikhila");
		System.out.println(g1);
	}

}
