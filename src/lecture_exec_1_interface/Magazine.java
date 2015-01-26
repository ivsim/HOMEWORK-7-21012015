package lecture_exec_1_interface;

public class Magazine extends SomethingToRead implements Sellable, Fillable{

	private int price;
	
	public Magazine(String text, int price){
		super.text = text;
		super.getNumWords();
		this.price = price;	
	}
	
	public void sell(){
		System.out.println("This magazine is to be sold for: " + this.price + " dollars.");
	}
	
	public void add(){
		int num = super.getNumWords() + 5;
		System.out.println(num);
	}
	
}
