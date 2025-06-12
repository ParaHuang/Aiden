package day11;

public class Main1 {
//	with static modifier:it belongs to class
	//OOP:object oriented program
	static int x = 10;
	public static void main(String[] args) {
		print5Hello();
		
		System.out.println();
		printHello(3);		//3times
		System.out.println();
		printHello(8);		//8times
		
		
		int a,b=13;
		int x=add(5,6),y = add(12,1);
		System.out.println(x);
//		System.out.println(x);
		//create an object of Main1
//		Main1 m = new Main1();
//		m.print5Hello();
	}
	
	//define a method
	public static void print5Hello() {
		for(int i=0 ; i<5 ; i++) {
			System.out.println("hello");
		}
	}
	
	public static void printHello(int times) {
		for(int i=0 ; i<times ; i++) {
			System.out.println("hello");
		}
	}
	
	public static int add(int a,int b) {
		
		return a+b;
	}
}
