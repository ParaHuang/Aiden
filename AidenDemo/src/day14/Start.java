package day14;

import java.util.Random;

public class Start {

	public static void main(String[] args) {
		Human h = new Human();
		h.test1();
		h.test1(10);
//		h.eat();
//		h.sleep();
//		
//		System.out.println("---------");
//		
		Student s = new Student();
//		s.study();
//		s.eat();
//		s.sleep();
		
		
//		System.out.println("---------");
		
//		UniversityStudent u = new UniversityStudent();
//		u.work();
//		u.study();
//		u.eat();
//		u.sleep();
		
		Random random = new Random();
		//methods overloading
		random.nextInt();		//big number
		random.nextInt(10);		//0~9
		random.nextInt(3, 7);	//3~6
		
	}

}
//inheritance chain