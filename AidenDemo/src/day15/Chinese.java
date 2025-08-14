package day15;

//OOP:object oriented language
//every class extend Object by default
public class Chinese extends Human{
	//overloading:in the same class, methods are in the same name but with different parameters
	//override:SubClass rewrite the method from SuperClass
	@Override
	public void eat() {
		System.out.println("Chinese eat with chopsticks");
	}
	
	public void kungFu() {
		System.out.println("Chinese knows kungfu");
	}

	//toString:comes from Object
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
}


//extends 1 class
//single extends,
class A{}
class B{}
class C extends A{}

interface E{}
interface F{}
class G implements E,F{}

















