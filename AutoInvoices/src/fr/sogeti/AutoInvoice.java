/**
 * 
 */
package fr.sogeti;

import fr.sogeti.bean.Invoice;
import fr.sogeti.bean.Product;
import fr.sogeti.enums.ProductType;

/**
 * @author sleray
 *
 */
public class AutoInvoice {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		// create the dataset (It should be done from a JSON file instead)
		
		//Invoice 1
		Product product1_1 = new Product("livre",ProductType.BOOK,12.49d,false);
		Product product1_2 = new Product("CD musical",ProductType.DEFAULT,14.99d,false);
		Product product1_3 = new Product("barres de chocolat",ProductType.FOOD,0.85d,false);
		
		//Create the invoice
		Invoice invoice1 = new Invoice();
		invoice1.addToCart(product1_1, 2);
		invoice1.addToCart(product1_2, 1);
		invoice1.addToCart(product1_3, 3);
		
		invoice1.print();
		
		System.out.println("");

	}
	
	

	
	

}
