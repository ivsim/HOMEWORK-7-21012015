package lecture_examples;

import java.math.BigDecimal;

public class CustomExceptions {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount("Иван Георгиев", new BigDecimal (100));
		
		try {
			BigDecimal money = new BigDecimal(300);
			myAccount.withdraw(money);
			
			System.out.println("Успешна операция!");
			
		} catch (WithdrawException e) {
			System.out.println("Възникна грешка при изпълняване на транзакцията!");
			System.out.println(e.getMessage());;
		} finally {
			System.out.println("Операцията приключи.");
		}
	}

}
