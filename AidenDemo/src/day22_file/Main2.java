package day22_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) throws Exception {
		//
		//			direction		
		//read	->	input			
		//write	->	output
		//2 types: byte(all file), character(text file)
		
		//1 Chinese character = 2 byte
		
		
		//Stream	->	InputStream,OutputStream
		//read content
		
		//1.create inputstream based on a certain file
		InputStream in = new FileInputStream("/Users/parahuang/Downloads/happyFolder/a.txt");
		//2.read all content
		byte[] bs = in.readAllBytes();
		
		//System.out.println(Arrays.toString(bs));//ASCII
		String str = new String(bs);
		System.out.println(str);
	
		in.close();
		//1 byte = 8 bit
		//1 bit can describle 2 binary number (0   1)
		
		//2^7 = 128
	}

}
