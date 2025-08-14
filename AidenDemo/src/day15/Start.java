package day15;


public class Start {

	public static void main(String[] args) {
		/*
		Chinese c = new Chinese();
		c.eat();
		c.sleep();
		System.out.println();
		
		American a = new American();
		a.eat();
		a.sleep();
		System.out.println();
		
		Indian i = new Indian();
		i.eat();
		i.sleep();
		*/
		
		Chinese c = new Chinese();
		American a = new American();
		Indian i = new Indian();
		Japanese j = new Japanese();
		
		Club club = new Club();
		
		club.party(c);
		club.party(a);
		club.party(i);
		club.party(j);
		
		
	}

}

//OOP
//encapsulation
//inheritance
//polymorphism:to make code more flexible, 1 things shows in different way
//2 precondition of polymorphism:
//a.reference type change
//b.override














