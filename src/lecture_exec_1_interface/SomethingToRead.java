package lecture_exec_1_interface;

public abstract class SomethingToRead {

	protected int numWords;
	protected String text;
		
	public int getNumWords(){
		
		String[] temp = this.text.split(" |\\.|'|,");
		
		this.numWords = temp.length;
		
		return this.numWords;
	}
	
}
