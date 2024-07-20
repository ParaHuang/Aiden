package day10;

public class Main4 {

	public static void main(String[] args) {
		//use Book class
		//class->Object
		//Class	name = new Class();
		Book b1 = new Book("Harry Potter",30);
		//use objectName.attribute to manipulate them
		// .		-> 's  ,  of
//		b1.name = "Harry Potter";
//		b1.price = 30;
//		b1.type = "magic";
//		b1.author = "JK.";
//		b1.description = "a nice novel talking about magic school";
		
		b1.turningPage();
		
		Book b2 = new Book("Little Prince",25);//Little Prince, 25
		b2.turningPage();
	}
	

}
