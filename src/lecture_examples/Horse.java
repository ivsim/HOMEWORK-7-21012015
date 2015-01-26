package lecture_examples;

public class Horse extends ChessPiece implements Movable, Printable {
	
	public Horse(String position){
		this.position = position;
	}
	
//	override...
	public void print(){
		System.out.println("Horse position: " + this.position);
	}
	
//	override...
	public void move(String position){
		this.position = position;
	}

}
