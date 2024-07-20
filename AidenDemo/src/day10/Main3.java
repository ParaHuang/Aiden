package day10;

import java.util.HashMap;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("UK", "London Liverpool Manchester Birmingham");
		map.put("America", "Chicago Alaska Ios Angeles San Francisco");
		map.put("China", "Beijing Shanghai Guangzhou Shenzhena");
		map.put("Austrilia", "Sydney Melbourne Canberra Brisbane");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("where are you from?");
		String country = scanner.nextLine();
		String cities = map.get(country);
		if(cities==null) {
			System.out.println("sorry we don't have this option for now");
		}else {
			System.out.println("Those are some famouse citys in "+country+":");
			System.out.println(cities);
		}
		
	}

}














