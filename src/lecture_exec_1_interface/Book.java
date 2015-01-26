package lecture_exec_1_interface;

public class Book extends SomethingToRead implements Sellable, Readable, Fillable{

	public Book(String name){
		super.text = name;
		super.getNumWords();
		
	}
	
	// override...
	
	public void read(){
		System.out.println("Book's title is: " + super.text);
	}
	
	// override...
	
	public void sell(){
		System.out.println("Book costs " + (super.getNumWords()*1.5) + " cents.");
	}
	
	// override...
	
	public void add(){
		int counter = 0;
		System.out.println("Books' count: " + (++counter));
	}
	
	
	
}
