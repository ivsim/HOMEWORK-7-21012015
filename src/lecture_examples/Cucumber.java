package lecture_examples;

public class Cucumber extends Vegetable implements Growable {

	private int size;
	
	public Cucumber(int size){
		this.size = size;
		this.name = "Cucumber";
		this.color = "Green";
	}
	
	@Override
	public void grow() {
		this.size += 2;
	}
	
	@Override
	public String toString() {
		String vegString = super.toString();
		return vegString + " Size: " + this.size + " cm.";
	}

}
