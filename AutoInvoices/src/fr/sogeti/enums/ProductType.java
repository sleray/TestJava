/**
 * 
 */
package fr.sogeti.enums;

/**
 * Product Type enum with the taxPercent variable
 * @author sleray
 *
 */
public enum ProductType {
FOOD(0d),DRUG(0d),BOOK(0.10d),DEFAULT(0.20d);
	
	//Store the tax percent applied to this type of product
	private double taxPercent;
	
	private ProductType(double taxPercent) {
		this.taxPercent = taxPercent;
	}

	//Only a getter for this, value is only set at constructor level
	public double getTaxPercent() {
		return taxPercent;
	}
}
