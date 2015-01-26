package lecture_examples;

public class Polymorphism {

	public static void main(String[] args) {

		Cucumber firstCucumber = new Cucumber(7);
		Cucumber secondCucumber = new Cucumber(3);
		Cucumber thirdCucumber = new Cucumber(5);
		
		Tomato firstTomato = new Tomato(50);
		Tomato secondTomato = new Tomato(70);
		Tomato thirdTomato = new Tomato(120);
		
		Vegetable[] vegetables = new Vegetable[6];
		Growable[] grows = new Growable[6];
		
		vegetables[0] = firstCucumber;
		vegetables[1] = firstTomato;
		vegetables[2] = secondCucumber;
		vegetables[3] = secondTomato;
		vegetables[4] = thirdCucumber;
		vegetables[5] = thirdTomato;
		grows[0] = firstCucumber;
		grows[1] = firstTomato;
		grows[2] = secondCucumber;
		grows[3] = secondTomato;
		grows[4] = thirdCucumber;
		grows[5] = thirdTomato;
		
		for (int i = 0; i < grows.length; i++) {
			Growable current = grows[i];
			current.grow();
		}
		
		for (int i = 0; i < vegetables.length; i++) {
			Vegetable current = vegetables[i];
			System.out.println(current);
		}
		
		
	}

}
