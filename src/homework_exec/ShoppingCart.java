package homework_exec;

import java.util.ArrayList;
import java.math.BigDecimal;

public class ShoppingCart {

	private BigDecimal availableCash;
	private ArrayList<Sellable> list;
	
	public ShoppingCart(BigDecimal initialCash) {
		this.availableCash = initialCash;
		this.list = new ArrayList<Sellable>();
	}
	
	public void sell(Sellable x, int numberToBuy) throws AvailabilityException {
		BigDecimal total = x.money(numberToBuy);
		
		if (this.availableCash.compareTo(total) == -1) {
			throw new AvailabilityException("Purchase impossible. "
					+ "Not enough available cash");
		}
		
		for (int i = 1; i <= numberToBuy; i++) {
			list.add(x);
		}
		
		this.availableCash = this.availableCash.subtract(total);		
	}
	
	public void checkCashItems() {
		System.out.println("purchased gadgets: ");
		for (Sellable x : list) {
			System.out.println(x.getName());
		}
		System.out.println();// just a new line..
	}
	
}