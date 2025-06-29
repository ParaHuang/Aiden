package day13;

public class StartStudent {

	public static void main(String[] args) {
		Student.teacherName = "Miss Yang";
		
		Student stu1 = new Student(1001, "Jack", 14);
		Student stu2 = new Student(1002, "Alex", 13);
		
		System.out.println(stu1);
		System.out.println(stu2);
		
//		stu1.setTeacherName("Mr lv");
//		stu1.teacherName = "Mr lv";
		Student.teacherName = "Mr lv";
		System.out.println();
		
		System.out.println(stu1);
		System.out.println(stu2);
		
		
		System.out.println("right now there are "+Student.count+" students in this class");
		System.out.println();
		
//		stu1.test1();
		Student.test1();
		stu1.test2();
		
		//tool class:doesn't keep any information, just to finish some process
		System.out.println(Math.abs(-15));
		System.out.println(Math.pow(5, 3));
		
		
		
		
		
		
		
		
		
	}

}
