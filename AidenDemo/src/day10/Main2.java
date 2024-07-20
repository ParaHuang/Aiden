package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		//name age gender  height
		//Jack,18, male,   1.89
//		ArrayList list = new ArrayList();
//		list.add("Jack");
//		list.add(18);
//		list.add("male");
//		list.add(1.89);
	
		
//		System.out.println("name:"+list.get(0));
//		System.out.println("height:"+list.get(3));
				
		//key-value    key:unique
		//python-dictionary			java-map
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("height", 1.89);
		map.put("name", "Jack");
		map.put("age", 18);
		map.put("gender", "male");
		map.put("name", "Mike");
		
//		Map<String, Object> map = Map.of("name","Jack","age",18,"gender","male","height",1.89);
		
		String name = (String) map.get("name");
		System.out.println("name:"+name);
		System.out.println("gender:"+map.get("gender"));
		System.out.println(map.get("wrongkey"));
		
		
		Object removed = map.remove("name");//returns the object removed
		System.out.println(removed+" just removed");
		
		//get all the key part, put them in a set
		Set<String> set = map.keySet();
		System.out.println(set);
		for(String key:set) {
			System.out.println(map.get(key));
		}
		
	}

}














