package day22_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main3 {

	public static void main(String[] args) throws Exception {
		//create an object of output stream													append or not
		OutputStream out = new FileOutputStream("/Users/parahuang/Downloads/happyFolder/a.txt",true);
		
		out.write("\r\n22222".getBytes());
		
		out.close();
	}

}
