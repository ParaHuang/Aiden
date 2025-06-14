package day12;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		// == comparing address
		
		//constant pool:
		String str1 = "hello";//define a value "hello" in constant pool
		String str2 = "hello";//using the "hello" exists in constant pool
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));	//comparing content
		
		
//		Scanner scanner = new Scanner(System.in);
//		String str3 = scanner.next();
//		String str4 = scanner.next();
//		
//		System.out.println(str3==str4);
		System.out.println();
		String str5 = new String("hello");
		String str6 = new String("hello");
		System.out.println(str5==str6);
		System.out.println(str5.equals(str6));
	}

}
