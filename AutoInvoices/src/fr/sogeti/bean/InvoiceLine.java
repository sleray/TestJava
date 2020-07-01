/**
 * 
 */
package fr.sogeti.bean;

import java.text.DecimalFormat;

/**
 * one line of an invoice
 * 
 * @author sleray
 *
 */
public class InvoiceLine {

	private Product product;
	private Integer numberOfProduct;

	/**
	 * @param product
	 * @param numberOfProducts
	 */
	public InvoiceLine(Product product, int numberOfProducts) {
		super();
		this.product = product;
		this.numberOfProduct = numberOfProducts;
	}
	public InvoiceLine() {
		
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the numberOfProduct
	 */
	public Integer getNumberOfProduct() {
		return numberOfProduct;
	}

	/**
	 * @param numberOfProduct the numberOfProduct to set
	 */
	public void setNumberOfProduct(Integer numberOfProduct) {
		this.numberOfProduct = numberOfProduct;
	}

	public double getTotalWithTaxes() {
		// get the price with taxes for each product
		double basePrice = this.product.getBasePrice();
		double taxAmount = getTaxes();
		double priceWithTaxes = basePrice* this.numberOfProduct + taxAmount;

		return priceWithTaxes;
	}
	
	public double getTaxes() {
		double taxPercent = this.product.getProductType().getTaxPercent() + (this.product.isImported() ? 0.05d : 0d);
		double taxAmount = this.product.getBasePrice() * taxPercent *this.getNumberOfProduct();
		return roundTaxAmount(taxAmount);
		
	}
	public String getFormattedTotalWithTaxes() {
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(2);
		return df.format(getTotalWithTaxes());
	}

	public double roundTaxAmount(double taxAmount) {
		return (Math.ceil(taxAmount / 0.05) * 0.05);

	}
}
