package day12;

//OOP:object oriented programming
//		process:abstraction     (objects->class)

//encapsulation:to keep code safe. make fields private, make methods public .access private fileds with public method
public class Student {
	//id,name,age(5~45),class
	//fields,instance variable,member variable
	private int id;	//1000
	private String name;
	private int age;			//5~45
	private String gender;		//male/female
	private String cls;	//class
	
	//constructor
	//1.a special method, has no concept of return,name is same as class
	//2.it's the process of creating an object,called by new
	//3.very class has an invisible constructor, 		public Student(){}
	//4.once you start write constructor, the invisible disappear
	//5.usually we initialize fields in constructor
	public Student(int id, String name, int age, String gender, String cls) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.cls = cls;
	}
	
	
	//id = ?;	set up a value						->setter	setXxx  setId  setName
	//print id,   xxx = id;      get the value		->getter	getXxx	getId  getName
	
	//member method
	public void study() {
		System.out.println(name+" is studying,this student is "+age+" years old");
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		//this:current object
		if(id<=1000) {
			throw new RuntimeException("invalid id");
		}
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		//this:current object
		if(age<5 || age>45) {
			throw new RuntimeException("invalid age");
		}
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if(!gender.equals("male") && !gender.equals("female")) {
			throw new RuntimeException("invalid gender");
		}
		this.gender = gender;
	}

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public void exam(String subject) {
		System.out.println("the student with id "+id+" is taking an "+subject+" exam");
	}


	@Override
	public String toString() {
		return "the id is :" + id + ", the name is " + name + ", age=" + age + ", gender=" + gender + ", cls=" + cls + "]";
//		return "hello";
	}
	
}
