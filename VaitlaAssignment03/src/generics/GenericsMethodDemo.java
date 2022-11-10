/**
 * 
 */
package generics;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class GenericsMethodDemo {
public static <Practice> void printArray(Practice[] input) {
		
		for(Practice print: input) {
			System.out.print(print + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] names = {"Nikhila", "Padma", "Samyu"};
		System.out.println("Array names contain: ");
		printArray(names);
	}

}
