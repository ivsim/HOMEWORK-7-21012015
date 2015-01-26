package lecture_examples;

public class Parsing {

	public static void main(String[] args) {
		
		String numberVar = "33";
		
		String doublerVar = "22.55";
		
		String booleanVar = "True";
		
		try {
			
			int num = Integer.parseInt(numberVar);
			double dob = Double.parseDouble(doublerVar);
			boolean b = Boolean.parseBoolean(booleanVar);
			
			System.out.println(num + 2);
			System.out.println(dob / 11);
			System.out.println(b);
			
		} catch (NumberFormatException e) {
			System.out.println("Възникна грешка при парсването!");
		} catch (NullPointerException e) {
			System.out.println("Подаден нулев string");
		}

	}

}
