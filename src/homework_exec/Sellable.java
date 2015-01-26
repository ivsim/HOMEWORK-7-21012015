package homework_exec;

import java.math.BigDecimal;

public interface Sellable {

	public BigDecimal money(int itemToSell);
	public String getName();
}