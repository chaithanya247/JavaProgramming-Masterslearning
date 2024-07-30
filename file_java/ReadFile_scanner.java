package file_java;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile_scanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("./scanner.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		Scanner sc=new Scanner(f);
		//or
		//Scanner sc=new Scanner(new FileInputStream(f))
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}

		

	}

}
