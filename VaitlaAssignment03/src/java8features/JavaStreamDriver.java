/**
 * 
 */
package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class JavaStreamDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<JavaStreamExample> productsList = new ArrayList<JavaStreamExample>();  
        //Adding Products  
        productsList.add(new JavaStreamExample("HP Laptop",25000f));  
        productsList.add(new JavaStreamExample("Dell Laptop",30000f));  
        List<Float> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(productPriceList2);


	}

}
