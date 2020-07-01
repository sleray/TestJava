/**
 * 
 */
package fr.sogeti.bean;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sleray
 *
 */
public class Invoice {
	
	private List<InvoiceLine> cart;
	
	public void addToCart(Product newProduct, int numberOfProducts) {
		if (this.cart != null) {
			this.cart.add(new InvoiceLine(newProduct, numberOfProducts));
		}
	}

	/**
	 * 
	 */
	public Invoice() {
		super();
		this.cart = new ArrayList<>();
	}

	/**
	 * @return the cart
	 */
	public List<InvoiceLine> getCart() {
		return cart;
	}

	/**
	 * @param cart the cart to set
	 */
	public void setCart(List<InvoiceLine> cart) {
		this.cart = cart;
	}

	//Print the invoice in System.Out
	public void print() {
		System.out.println("");
		System.out.println("");
		
		//Print the single lines from the cart list
		for (InvoiceLine invoiceLine : cart) {
		  StringBuilder sb = new StringBuilder();
		  sb.append("* ");
		  sb.append(invoiceLine.getNumberOfProduct());
		  sb.append(" ");
		  sb.append(invoiceLine.getProduct().getName());
		  sb.append(" à ");
		  sb.append(invoiceLine.getProduct().getBasePrice());
		  sb.append("€ : ");
		  sb.append(invoiceLine.getFormattedTotalWithTaxes());
		  sb.append("€ TTC");
		  System.out.println(sb.toString() +"=> "+invoiceLine.getTaxes());
		}
		System.out.println("");
		System.out.println("Montant des taxes : "+this.formattedTotalTaxes()+"€");
		System.out.println("Total : "+this.formattedTotal()+"€");
	}

	private String formattedTotal() {
		double total = 0d;
		for (InvoiceLine invoiceLine : cart) {
			total += invoiceLine.getTotalWithTaxes();
		}
		//format over 2 digits
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(2);
		return df.format(total);
	}

	private String formattedTotalTaxes() {
		double totalTaxes = 0d;
		for (InvoiceLine invoiceLine : cart) {
			totalTaxes += invoiceLine.getTaxes();
		}
		//format over 2 digits
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(2);
		return df.format(totalTaxes);

	}

}
