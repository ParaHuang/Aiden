package day15;

public class Start2 {

	public static void main(String[] args) {
		//Initialize
		//ClassName reference = new ClassName();
		Chinese c = new Chinese();
		c.eat();
		c.sleep();
		c.kungFu();
		
		
		American a = new American();
		Indian i = new Indian();
		
		//reference type change
		//1.the type of reference would decide what method you can use
		//2.how it really do depends the type of object
		//SuperClass reference = new SubClass();
//		with what kind of way you think of this object             real object
		Human h1 										= 		 new Chinese();
		Human h2 = new American();
		Human h3 = new Indian();
		
		
		h1.eat();
		h1.sleep();
		//h1.kungFu();
		
		h2.eat();
		h3.eat();
		
		
		Chinese c5 = (Chinese) h1;
		c5.kungFu();
		
		//American a5 = (American) h1;
	
		
		
		
	}

}
