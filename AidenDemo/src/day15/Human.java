package day15;

public abstract class Human {
	//1.when there is a method, all subclass override it, then we can delete the method body
	//2.a method without body is abstract
	//3.a class with abstract method is also abstract
	//4.all the SubClass of an abstract class are forced to override those abstract method
	public abstract void eat();//it's import to eat, but how to eat is not 

	public void sleep() {
		System.out.println("Human is sleeping");
	}
}


//1.eat method from Human is never used, do we still need it?
//2.if we need it, then what's point the have those code inside?