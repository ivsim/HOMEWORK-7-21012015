package lecture_exec_1_interface;

/*
 * Направете интерфейс за неща които могат да се продават (Sellable), за неща които могат да се четат (Readable),
 * и за неща които могат да се добавят (Fillable) и дефинирайте по 1 метод.
 * Направете абстрактен клас за четиво като заложите променлива за броя на думите вътре, както и текст.
 * Всеки път когато текста се променя изчислявайте броя на думите. Наследете абстрактния клас с 3 класа за вестник, списание и книга.
 * Демонстрирайте класовете с няколко примера. 
 */

public class Exec_1 {

	public static void main(String[] args) {

		Newspaper read1 = new Newspaper("We scoured these lists to find a few cities that are "
				+ "making big strides but still under many travellers' radar.");
		
		Book read2 = new Book("The fountain");
		
		Magazine read3 = new Magazine("TIME", 12);
		
		read1.read();
		read1.sell();
		
		read2.read();
		read2.sell();
		read2.add();
		
		read3.add();
		read3.sell();
		
	}

}
