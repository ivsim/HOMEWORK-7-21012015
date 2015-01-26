package lecture_examples;

public class Vegetable {
	
	protected String name;
	protected String color;
	
	// override...
	public String toString(){
		return this.color + " " + this.name;
	}

}
