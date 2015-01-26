package lecture_exec_1_interface;

public class Newspaper extends SomethingToRead implements Readable, Sellable{

	public Newspaper(String text){
		super.text = text;
		super.getNumWords();
		
	}
	
		// override...
		
		public void read(){
			System.out.println("Number of words to read in the newspaper: " + super.getNumWords());
		}
		
		// override...
		
		public void sell(){
			System.out.println("This newspaper costs " + (super.getNumWords() * 2) + " cents.");
		}

	
}
