package homework_exec;

import java.math.BigDecimal;

public class Gadget implements Sellable {

	private String makeModel;
	private BigDecimal unitPrice;
	
	public Gadget(String makeModel, BigDecimal unitPrice) {
		this.makeModel = makeModel;
		setPrice(unitPrice);
	}
	
	public String getName() {
		return this.makeModel;
	}
	
	public void setPrice(BigDecimal unitPrice) {
		BigDecimal temp = new BigDecimal(0);
		if (unitPrice.compareTo(temp) == -1) {
			this.unitPrice = temp;
		}
		
		this.unitPrice = unitPrice;
	}
	
	public BigDecimal money(int itemsToSell) {
		BigDecimal temp = new BigDecimal(itemsToSell);
		BigDecimal moneyTotal = this.unitPrice.multiply(temp);
		return moneyTotal;
	}
	
}