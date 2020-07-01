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

		
		//Invoice 2
		Product product2_1 = new Product("boîtes de chocolats importée", ProductType.FOOD,10d,true);
		Product product2_2 = new Product("flacons de parfum importé", ProductType.DEFAULT,47.5d,true);
		
		Invoice invoice2 = new Invoice();
		invoice2.addToCart(product2_1, 2);
		invoice2.addToCart(product2_2, 3);
		
		invoice2.print();
		
		System.out.println("");
		
		//Invoice 3
		Product product3_1 = new Product("flacons de parfum importé", ProductType.DEFAULT,27.99d,true);
		Product product3_2 = new Product("flacon de parfum", ProductType.DEFAULT,18.99d,false);
		Product product3_3 = new Product("boîtes de pilules contre la migraine", ProductType.DRUG,9.75d,false);
		Product product3_4 = new Product("boîtes de chocolats importés", ProductType.FOOD,11.25d,true);
		
		Invoice invoice3 = new Invoice();
		invoice3.addToCart(product3_1, 2);
		invoice3.addToCart(product3_2, 1);
		invoice3.addToCart(product3_3, 3);
		invoice3.addToCart(product3_4, 2);
		
		invoice3.print();
	}
	
	

	
	

}
