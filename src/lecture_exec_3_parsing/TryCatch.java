package lecture_exec_3_parsing;

/*
 * Направете програма, която приема 2 дробни числа и дели първото на второто.
 * Използвайте try…catch… блок с всички възможни типове изключения
 */

public class TryCatch {

	public static void main(String[] args) {

		String first = "1/12";
		String second = "47/3";
		
		String[] firstNum = first.split("[ |/]+");
		String[] secondNum = second.split("[ |/]+");
		
		try {
			
			int numerator1 = Integer.parseInt(firstNum[0]);
			int denominator1 = Integer.parseInt(firstNum[firstNum.length - 1]);
			int fraction1 = numerator1 / denominator1;
			
			int numerator2 = Integer.parseInt(secondNum[0]);
			int denominator2 = Integer.parseInt(secondNum[secondNum.length - 1]);
			int fraction2 = numerator2 / denominator2;
			
			int divisionResult = (numerator1 * denominator2) / (denominator1 * numerator2);

			System.out.println(numerator1 * denominator2 + "/" + denominator1 * numerator2);
			
			float result = ((float)numerator1 * (float)denominator2) / 
						   ((float)denominator1 * (float)numerator2);
		
			System.out.println(result);
			
		} catch (ArithmeticException e) {
			System.out.println("You are trying to divide by zero.");
		} catch (NullPointerException e) {
			System.out.println("You haven't entered anything.");
		} catch (NumberFormatException e) {
			System.out.println("Parsing went wrong.");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		
	}

}
