package day14;

//OOP:Object Oriented Programming
//Encapsulation:to keep code safe(make fields private, make methods public, access private field by public method)
//Inheritance: to reuse code
//Porlimorphism
public class Human {
	//inside of a class, can't have methods exactly same
	//methods overloading: methods are in the same name, but with different parameters
	public void test1() {}
	public void test1(int x) {}
	
	
	
	public Human() {
		
	}
	
	public Human(int x) {
		System.out.println("-----the constructor of Human------");
	}
	
	public void eat() {
		System.out.println("Human is eating");
	}
	public void sleep() {
		System.out.println("Human is sleeping");
	}
}
