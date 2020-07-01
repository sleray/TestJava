/**
 * 
 */
package fr.sogeti.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.sogeti.enums.ProductType;

/**
 * @author sleray
 *
 */
class InvoiceLineTest {

	/**
	 * Test method for {@link fr.sogeti.bean.InvoiceLine#getRoundedTax(float)}.
	 */
	@Test
	void testRoundTaxAmount() {		
		InvoiceLine il = new InvoiceLine();
		assertEquals( 12.5d,il.roundTaxAmount(12.49d));
		assertEquals( 1.0d,il.roundTaxAmount(0.99d));
		assertEquals( 1.0d,il.roundTaxAmount(1.0d));
		assertEquals( 1.05d,il.roundTaxAmount(1.01d));
		assertEquals( 1.05d,il.roundTaxAmount(1.02d));
		
	}
	@Test
	void testSingleProductsSimpleTaxes() {
		//Test different Taxes patterns
		Product simpleFood = new Product("Simple food",ProductType.FOOD,100d,false);
		InvoiceLine il = new InvoiceLine(simpleFood,1);
		assertEquals(100d,il.getTotalWithTaxes());
		assertEquals(0d,il.getTaxes());
		
		Product simpleDrug = new Product("Simple drug",ProductType.DRUG,100d,false);
		InvoiceLine il2 = new InvoiceLine(simpleDrug,1);
		assertEquals(100d,il2.getTotalWithTaxes());
		assertEquals(0d,il2.getTaxes());
		
		Product simpleBook = new Product("Simple book",ProductType.BOOK,100d,false);
		InvoiceLine il3 = new InvoiceLine(simpleBook,1);
		assertEquals(110d,il3.getTotalWithTaxes());
		assertEquals(10d,il3.getTaxes());
		
		Product simpleDefault = new Product("Simple Other",ProductType.DEFAULT,100d,false);
		InvoiceLine il4 = new InvoiceLine(simpleDefault,1);
		assertEquals(120d,il4.getTotalWithTaxes());
		assertEquals(10d,il4.getTaxes());
		
		
	}

}
