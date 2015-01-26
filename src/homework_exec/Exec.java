package homework_exec;

/*
 * Направете интерфейс за предмети които могат да се продават Sellable.
 * Направете класове за Телевизор, Мобилен телефон и Лаптоп, които 
 * имплементират интерфейса Sellable.
 * Направете клас за пазарска кошника, който съдържа налична сума пари 
 * и лист от Sellable елементи.
 * Направете метод Sell от пазарската кошника, който при недостатъчна 
 * наличност хрърля изключение от специално дефиниран за случая тип.
 */

import java.math.BigDecimal;

public class Exec {

	public static void main(String[] args) {

		// Let's make some electronic stuff...
		
		Sellable tv1 = new TV("SONY 12WSD", new BigDecimal(999));
		Sellable tv2 = new TV("Panasonic", new BigDecimal(1299));
		Sellable mobile1 = new MobilePhone("Apple", new BigDecimal(1699));
		Sellable mobile2 = new MobilePhone("SAMSUNG", new BigDecimal(1200));
		Sellable laptop1 = new Laptop("ASUS", new BigDecimal(489));
		Sellable laptop2 = new Laptop("Lenovo", new BigDecimal(1800));
		
		// Let's make one shopping cart and have some cash...
		
		ShoppingCart basket1 = new ShoppingCart(new BigDecimal(15000));
		
		// Let's buy something
		
		try {
			basket1.sell(laptop2, 1);//first round of purchase...
			basket1.checkCashItems();
			basket1.sell(tv2, 10);//second round of purchase...
			basket1.checkCashItems();
			basket1.sell(mobile2, 1);//third round of purchase...
			basket1.checkCashItems();
		} catch (AvailabilityException e) {
			System.out.println(e.getMessage()); //first it tries to catch exception if it doesn't throw exception then it fulfills the block..
		}
		
		
		
		
	}

}
