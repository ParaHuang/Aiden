package day18_lambda;


public class Test1 {

	public static void main(String[] args) {
		/*
		C c = new C();
		c.test1();
		c.test2();
		
		B b1 = new B() {
			@Override
			public void test1() {
				System.out.println("B---test1");
			}
			@Override
			public void test2() {
				System.out.println("B---test2");
			}
		};
		b1.test1();
		b1.test2();
		*/
		D d1 = new D() {
			
			@Override
			public void test1() {
				System.out.println("D---the only abstract method");
			}
		};
		d1.test1();
		
		//lambda:anonymous function for FunctionalInterface
		//focus on 2 things:  parameter   +     body
		D d2 = ()->{
			System.out.println("D--lambda for the only method");
		};
		
		d2.test1();
		
		//()		for paramter
		E e1 = (int a)->{
			System.out.println("the parameter is "+a);
		};
		e1.test1(8);

		F f1 = (int a,String b)->{
			System.out.println("the parameter is "+a+" and "+b);
		};
		f1.test1(8,"hello");
		
		//1.you can emit all the type of parameter
		F f2 = (aaaaaa,bbbbbbb)->{
			System.out.println("the parameter is "+aaaaaa+" and "+bbbbbbb);
			System.out.println("more code");
		};
		f2.test1(99, "ok");
		
		//2.if there is only 1 code in method body, then you can emit {}
		F f3 = (a,b)->System.out.println("a="+a+",b="+b);
		f3.test1(10, "hey");
		
		
//		A a = new A() {
//			public void test1() {
//				
//			}
//		};
		G g1 = (a,b)->{
			System.out.println("more code");
			return a*b;
		};
		int result = g1.test1(4, 5);
		System.out.println(result);
		

		//3.if there is only 1 code in method body,and it's a return code, then we can just write the value you want to return
		G g2 = (a,b)->a*b;
		int result2 = g2.test1(3, 9);
		System.out.println(result2);
	}

}
abstract class A{
	public abstract void test1();
	public void test2() {
		
	}
}

//normal interface
interface B{
	void test1();
	void test2();
}

//FunctoinalInterface:the interface only contains 1 abstract method
@FunctionalInterface
interface D{
	void test1();
}

interface E{
	void test1(int a);
}

interface F{
	void test1(int a,String b);
}

interface G{
	int test1(int a,int b);
}








class C implements B{
	@Override
	public void test1() {
		System.out.println("C---test1");
	}

	@Override
	public void test2() {
		System.out.println("C---test2");
	}	
}