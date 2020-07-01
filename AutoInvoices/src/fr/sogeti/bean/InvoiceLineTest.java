/**
 * 
 */
package fr.sogeti.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

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
		assertEquals( 12.5f,il.roundTaxAmount(12.49f));
		assertEquals( 1.0f,il.roundTaxAmount(0.99f));
		assertEquals( 1.0f,il.roundTaxAmount(1.0f));
		assertEquals( 1.05f,il.roundTaxAmount(1.01f));
		assertEquals( 1.05f,il.roundTaxAmount(1.02f));
		
	}

}
