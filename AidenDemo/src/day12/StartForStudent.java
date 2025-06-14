package day12;

import java.util.Random;

public class StartForStudent {
	public static void main(String[] args) {
		//initialize (class->student object)
		//ClassName objectName = new ClassName();
		Student stu1 = new Student();	//new->create
		//access the member of object
		//objectName.memberVariable
		//objectName.memberMethod()
		//.   ->   's  ,   of
		stu1.setId(1001);
//		stu1.id = 1001;
//		stu1.name = "Jack";
//		stu1.age = -13;
		stu1.setAge(15);//15
//		stu1.cls = "RJ2404";
		stu1.setGender("male");
//
//		System.out.println(stu1.id);
//		System.out.println(stu1.name);
//		System.out.println(stu1.age);
		System.out.println(stu1.getAge());
//		System.out.println(stu1.cls);
		
		stu1.study();
		stu1.exam("Java");
		
		

		Student stu2 = new Student();	
		stu2.setId(1002);
//		stu2.id = 1001;
//		stu2.name = "Jack";
//		stu2.age = 13;
		stu2.setAge(13);//13
//		stu2.cls = "RJ2404";
//
//		System.out.println(stu2.id);
//		System.out.println(stu2.name);
//		System.out.println(stu2.age);
//		System.out.println(stu2.cls);
		
		
		stu2.study();
		
		
//		Random rd = new Random();
	}
}
