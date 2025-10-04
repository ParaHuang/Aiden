package day22_file;

import java.io.File;
import java.io.IOException;

public class Main1 {

	public static void main(String[] args) throws IOException {
		//1.accessing file
		//2.accessing the content of file
		
		
		
		/*
		//1.get/create the file object 
		File file = new File("/Users/parahuang/Downloads/x.html");
		//2.delete it
		file.delete();
		*/

		/*
		File file = new File("/Users/parahuang/Downloads/x.txt");
		//3.create file
		file.createNewFile();
		*/
		
		/*
		//4.create folder when it does not exist
		File file = new File("/Users/parahuang/Downloads/happyFolder");
		if(!file.exists())
			file.mkdir();
		*/
		
		/*
		//5.rename file
		File file = new File("/Users/parahuang/Downloads/x.txt");
		File fileWithNewName = new File("/Users/parahuang/Downloads/hello.txt");
		file.renameTo(fileWithNewName);
		*/
		
		//6.get file list inside of a folder
		File file = new File("/Users/parahuang/Downloads/happyFolder");
		File[] fs = file.listFiles();
		for(File f:fs) {
			System.out.println(f.getName()+"--"+f.getAbsolutePath()+"--"+f.isDirectory());
		}
		
		//find all the text file under a certain folder
		
		
		
		
	}

}
