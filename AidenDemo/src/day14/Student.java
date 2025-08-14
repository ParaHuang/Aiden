package day14;

//inheritance
//SubClass will have those public members from SuperClass
//class SubClass extends SuperClass{}
//SubClass-ChildClass
//SuperClass-ParentClass-BaseClass

//constructors in inheritance
//1.when you are creating an object of Subclass
//call the constructor of Superclass ()	->	the constructor of SubClass
//2.when SuperClass only has the constructor with parameter, then super() is wrong
//solution:
//a. supply a empty constructor in SuperClass
//b. using super(value1,value2,value3);  to call the constructor exist in SuperClass
public class Student extends Human{
	//constructor
	public Student() {
		//inside of SubClass, super refers to the object of SuperClass
		//invisible code
		super();	//calling the constructor of super class.  first sentence
//		super(5);
		System.out.println("-----the constructor of Student-----");
	}
	
	public void study() {
		System.out.println("Student is Studying");
	}
}

//Student = methods of Human  +  study
