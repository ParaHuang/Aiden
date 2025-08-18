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
		
		
		YoungPeople people = new YoungPeople();
		people.haveFun(p);
		people.haveFun(n);
		people.haveFun(x);
	}
}

class YoungPeople{
	public void haveFun(GameMachine gm) {
		System.out.println("young people is having fun now....");
		gm.playGame();
	}
}



abstract class GameMachine{
	public abstract void playGame();
}

class PS5 extends GameMachine{
	@Override
	public void playGame() {
		System.out.println("PS5:buy a game CD，connect with TV，there we go!");
	}
}

class Nintendo extends GameMachine{
	@Override
	public void playGame() {
		System.out.println("Nintendo:turn it on，choose a game，playing alone，so nice");
	}
}

class XBox extends GameMachine{
	@Override
	public void playGame() {
		System.out.println("XBox:connect with TV,choose a game from game store, then play");
	}
}
