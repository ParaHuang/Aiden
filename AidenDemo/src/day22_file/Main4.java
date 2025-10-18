package day22_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main4 {

	public static void main(String[] args) throws IOException {
		//Reader->character input stream
		BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
//		//absolute path:full path from earth->USA
//		//relative path:Aiden
		
		/*
		String line1 = br.readLine();	//read 1 line, return the content of that line, return null if there is no content left
		System.out.println(line1);

		String line2 = br.readLine();
		System.out.println(line2);
		String line3 = br.readLine();
		System.out.println(line3);
		String line4 = br.readLine();
		System.out.println(line4);
		*/
		
		while(true) {
			String line = br.readLine();	//read 1 line, return the content of that line, return null if there is no content left
			if(line == null) {
				break;
			}
			System.out.println(line);
		}
		
		
//		File file1 = new File("hello.txt");		//relative path
//		System.out.println(file1.getAbsolutePath());
//		
//		File file2 = new File("/Users/parahuang/Documents/GitHub/Aiden/AidenDemo/hello.txt");//absolute path
//		System.out.println(file2.getAbsolutePath());
	}

}
