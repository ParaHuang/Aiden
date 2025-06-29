package day13;

//assuming all student object are in the same class
public class Student {
	//fields , instance variable,member
	private int number;
	private String name;
	private int age;
	//1.static variable belongs to class,object share the variable 
	//2.usually we make static variable public 
	//3.it's unnecessary to use object to access static variable, use ClassName.staticVariable
	public static String teacherName;	
	public static int count;
	
	public Student(int number, String name, int age) {
		this.number = number;
		this.name = name;
		this.age = age;
		count++;
	}
	
//	public void setTeacherName(String teacherName) {
//		this.teacherName = teacherName;
//	}
	
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", age=" + age + ", teacherName=" + teacherName + "]";
	}
	
	//1.static method belongs to class,every object shares it
	//2.usually call static method by     ClassName.staticMethod();
	//3.inside of a static method, we can't use non-static member directly
	public static void test1() {
		System.out.println("test1--------");
//		test2();			//wrong, this method belongs to object
//		number = 1001;		//wrong, this variable belongs to object
		test3();
		teacherName = "Miss Zhang";
	}
	
	//member method
	public void test2() {
		System.out.println("test2--------");
	}
	
	public static void test3() {
		System.out.println("test3-------");
	}
}











