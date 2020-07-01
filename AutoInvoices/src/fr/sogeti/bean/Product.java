/**
 * 
 */
package fr.sogeti.bean;

import fr.sogeti.enums.ProductType;

/**
 * @author sleray
 *
 */
public class Product {

	private String name;
	private ProductType productType;
	private double basePrice;
	private boolean imported;
	
	//Only one constructor to make it mandatory to fill all the infos
	public Product(String name, ProductType productType, double basePrice, boolean imported) {
		this.name = name;
		this.productType = productType;
		this.basePrice = basePrice;
		this.imported = imported;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the productType
	 */
	public ProductType getProductType() {
		return productType;
	}

	/**
	 * @param productType the productType to set
	 */
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	/**
	 * @return the basePrice
	 */
	public double getBasePrice() {
		return basePrice;
	}

	/**
	 * @param basePrice the basePrice to set
	 */
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	/**
	 * @return the imported
	 */
	public boolean isImported() {
		return imported;
	}

	/**
	 * @param imported the imported to set
	 */
	public void setImported(boolean imported) {
		this.imported = imported;
	}
	
}
