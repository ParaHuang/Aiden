package day16_polymorphism;

//polymorphism: 1 thing shows in different ways

//2 preconditions:
//a. reference type change
//b. method override

//inside of a java file, there is only 1 public class, and it has to be same name as file name
public class Main {
	public static void main(String[] args) {
		PS5 p = new PS5();
		Nintendo n = new Nintendo();
		XBox x = new XBox();

		Polaroid plrd = new Polaroid();
		GoPro gpr = new GoPro();
		DSLR digi = new DSLR();
		
		CellPhone cell = new CellPhone();

		YoungPeople people = new YoungPeople();
		people.haveFun(p);
		people.haveFun(n);
		people.haveFun(x);
		System.out.println();

		people.record(plrd);
		people.record(gpr);
		people.record(digi);
		System.out.println();

		people.haveFun(cell);
		people.record(cell);
	}
}

class YoungPeople {
	public void haveFun(GameMachine gm) {
		System.out.println("young people is having fun now....");
		gm.playGame();
	}

	public void record(Camera c) {
		System.out.println("young person is recording now with a camera");
		c.take_picture();
	}
}
//1.there are abstract methods inside of a class, then this class is also abstract (abstract class = abstract method + normal method)
//2.if there are only abstract methods inside of an abstract class, then we can make this abstract class into interface
//3.since there are only abstract methods inside of interface, then we don't need to declare as public abstract
//4.we implements interface
interface GameMachine {
	void playGame();
}

class PS5 implements GameMachine {
	@Override
	public void playGame() {
		System.out.println("PS5:buy a game CD，connect with TV，there we go!");
	}
}

class Nintendo implements GameMachine {
	@Override
	public void playGame() {
		System.out.println("Nintendo:turn it on，choose a game，playing alone，so nice");
	}
}

class XBox implements GameMachine {
	@Override
	public void playGame() {
		System.out.println("XBox:connect with TV,choose a game from game store, then play");
	}
}

interface Camera {
	void take_picture();
}

class Polaroid implements Camera {

	@Override
	public void take_picture() {
		System.out.println("POLAROID: press the shutter, get an instant photo");
	}

}

class GoPro implements Camera {

	@Override
	public void take_picture() {
		System.out.println("GOPRO: diving into ocean, let's memorize this beautiful world");
	}

}

class DSLR implements Camera {

	@Override
	public void take_picture() {
		System.out.println("DSLR: press the shutter, get an digital picture");
	}
}


class CellPhone implements GameMachine,Camera{

	@Override
	public void take_picture() {
		System.out.println("take my phone out, login, play some online games with my teammates");
	}

	@Override
	public void playGame() {
		System.out.println("take my phone out, take a picture that I can watch it everyday");
	}
	
}

//extends->inheritance
//implements->roles

//single extends
class A{}
class B{}
class C extends B{}

//multiple implements
interface D{}
interface E{}
class F extends A implements D,E{}

















