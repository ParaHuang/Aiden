package day6;

import java.util.Random;

//OOP:object oriented programming
public class Main1 {

	//inside of a static method, we can't use normal method directly
	public static void main(String[] args) {
		//initialize the class
		//ClassName name = new ClassName();
		Main1 m = new Main1();
		//then use the method
		m.fun1();
		System.out.println();
		m.fun1();
		System.out.println();
		
		m.fun2(3);//3times
		System.out.println();
		m.fun2(9);//9times
		System.out.println();
		
		int a = m.fun3(3, 5);
		
		
	}
	//how to define method in Java
	/*
	 * python
	 def methodName(parameter1,parameter2):
	 	methodBody
	 	return something
	 */

	/*
	public returnType methodName(paramaterList){
		methodBody
		return something;
	}
	paramaterList: type1 parameter1,type2 parameter2,type3 parameter3
	 */
	
	//1.without return value, without parameter
	public void fun1() {
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("hello"+i);
		}
	}
	
	//2.without return value,with parameter
	public void fun2(int times) {
		for(int i=1 ; i<=times ; i++) {
			System.out.println("hello"+i);
		}
	}
	
	//3.with return value(sometimes it's because the result of this method will affect the rest programe)
	public int fun3(int a,int b){
		//return the result of a plus b
		return a+b;
	}
	
	//define a calculator program,accept 3 parameter
	//2 numbers and 1 symbol
	//the symbol can only be +,-,*,/,%
	//return the result of 1st number doing the specific operation with 2nd number
	
	
	
}















