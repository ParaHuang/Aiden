package day10;

//1.how to define a class
//2.how to use a class:initialize(class->object)
public class Book {
	//fields,attributes,variables
	String name;
	String type;
	double price;
	String author;
	String description;
	
	//special method:constructor
	//1.no return, same name as Class,called by     new Book();
	//2.every class has invisible constructor,it looks like this:     public Book(){}
	//3.if you want to define your own constructor,the invisible one will disappear
	//4.we use constructor to initialize an object, meanwhile to initialize the those attributes of this class
	public Book(String n,double p) {
//		System.out.println("112233");
		name = n;
		price = p;
	}
	
	public String toString() {
		return "the name of this book:"+name+",the price:"+price;
	}
	
	//methods
	public void turningPage() {
		System.out.println("I just turn a page of "+name+", the book price is "+price);
	}
}

//OOP: object oriented programming
//database

//	object:feature		->		class:attribute	
//  name			type	price	Author		description									->class(the definition of A group of thing)
//HarrayPotter    magic    	30     	JK    		a nice novel talking about magic school   	->Object
//Little Prince   magic		15	 	Xxx			xxxxxxxxxxxxxxxxxxx							->Object


//object:action/behavior,what it can do		->	class:function/method
//turning page, write a comment on it

//



