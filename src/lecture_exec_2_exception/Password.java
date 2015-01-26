package lecture_exec_2_exception;

/*
 * Направете клас за потребител съдържащ полета за e-mail и парола.
 * Направете валидация за двете полета, като при намиране на невалидни данни създавайте изключения:
 * Валиден e-mail: над 5 символа, съдържа @ и
 * валидна парола: съдържа минимум 6 символа и поне една цифра.
 * Създайте програма, която приема данни за 3 потребителя и обработва коректно възможните изключения
 */

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("email: ");
		String email = input.nextLine();
		System.out.print("password: ");
		String password = input.nextLine();
			
		try {
			
			User user1 = new User(email, password);
			
				user1.setEmail(user1.email);
				user1.setPassword(user1.password);
				
				System.out.println("Password and email - successful!");

			} catch (IllegalArgumentException exception) {
				System.out.println("An error occurred: " + exception.getMessage());
			}
		
		System.out.print("email: ");
		email = input.nextLine();
		System.out.print("password: ");
		password = input.nextLine();
			
		try {

			User user2 = new User(email, password);	
			
//			User user2 = new User("abcwed.bg", "wsef");

				user2.setEmail(user2.email);
				user2.setPassword(user2.password);
				
				System.out.println("Password and email - successful!");
				
			} catch (IllegalArgumentException exception) {
				System.out.println("An error occurred: " + exception.getMessage());
			}
			
		System.out.print("email: ");
		email = input.nextLine();
		System.out.print("password: ");
		password = input.nextLine();
		
		try {

			User user3 = new User(email, password);	
			
//			User user3 = new User("abc@wefrg.com", "w123f");
				
				user3.setEmail(user3.email);
				user3.setPassword(user3.password);
				
				System.out.println("Password and email - successful!");
				
			} catch (IllegalArgumentException exception) {
				System.out.println("An error occurred: " + exception.getMessage());
			}
			
			//in order to control the exception it must be in the try block !!!...
			//the first exception found by try the message is thrown immediately, no matter the fact there can be other exceptions...
		
			input.close();
			
	}

}
