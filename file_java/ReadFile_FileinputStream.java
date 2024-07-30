package file_java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//different ways of reading the data from text files
//1.fileinputstream
//2.scanner
//3.fileReader
//4.BufferedReader

public class ReadFile_FileinputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("./resume.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		FileInputStream fs=new FileInputStream(f);
		int asciicode;
		while((asciicode=fs.read())!=-1) {
		System.out.print((char)asciicode);
		}
		fs.close();
		

	}

}
