package lecture_examples;

public class Tomato extends Vegetable implements Growable{

	private int weight;
	
	public Tomato(int weight){
		this.weight = weight;
		this.name = "Tomato";
		this.color = "Red";
	}
	
	@Override
	public void grow(){
		this.weight += 10;
	}
	
	@Override
	public String toString(){
		String vegString = super.toString();
		return vegString + " Weight: " + this.weight + " gr.";
	}
	
	
}
